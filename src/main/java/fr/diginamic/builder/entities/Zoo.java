package fr.diginamic.builder.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nom;
	private List<Zone> zones;
	
	Zoo() {
		// TODO Auto-generated constructor stub
	}
	
	Zoo(String nom) {
		super();
		this.nom = nom;
		this.zones = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
	
	 
}
