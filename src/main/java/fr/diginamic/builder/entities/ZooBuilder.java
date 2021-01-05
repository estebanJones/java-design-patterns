package fr.diginamic.builder.entities;

import java.util.Optional;

import fr.diginamic.builder.entities.interfaces.Builder;
import fr.diginamic.builder.exception.ZoneInconnueException;

public class ZooBuilder implements Builder{
	private Zoo zoo;
	
	public ZooBuilder() {
		this.zoo = new Zoo();
	}
	
	@Override
	public Builder appendZone(String nom, Integer capacite) {
		this.zoo.getZones().add(new Zone("Montpellier", 2000));
		return this;
	}
	
	
	@Override
	public Builder appendAnimal(Animal animal, String nomDeZone) throws ZoneInconnueException, CapaciteMaxException {
		Optional<Zone> zone = this.zoo.getZones().stream().filter(nomZone -> nomZone.getNom().equalsIgnoreCase(nomDeZone)).findFirst();
		if(zone.isPresent()) {	
			if(zone.get().getCapacite() >= zone.get().getAnimaux().size() + 1) {
				zone.get().getAnimaux().add(animal);
			} else {
				throw new CapaciteMaxException("Le nombre de places pour les animaux est atteinte !");
			}
		} else {
			throw new ZoneInconnueException("Cette zone est inconnue");
		}
		return this;
	}
	
	public Zoo get() {
		return this.zoo;
	}

}
