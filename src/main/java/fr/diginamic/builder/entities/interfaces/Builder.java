package fr.diginamic.builder.entities.interfaces;

import fr.diginamic.builder.entities.Animal;
import fr.diginamic.builder.entities.CapaciteMaxException;
import fr.diginamic.builder.exception.ZoneInconnueException;

public interface Builder {
	public Builder appendZone(String nom, Integer capacite);
	public Builder appendAnimal(Animal animal, String nom) throws ZoneInconnueException, CapaciteMaxException;
}
