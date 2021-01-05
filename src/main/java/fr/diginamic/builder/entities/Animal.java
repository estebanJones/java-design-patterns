package fr.diginamic.builder.entities;

public class Animal {
	private String nom;
	private Zone zone;
	
	public Animal(String nom, Zone zone) {
		super();
		this.nom = nom;
		this.zone = zone;
	}
	
	public Animal(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	
	
}
