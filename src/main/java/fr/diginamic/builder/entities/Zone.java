package fr.diginamic.builder.entities;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	private String nom;
	private Integer capacite;
	private Zoo zoo;
	private List<Animal> animaux;
	
	public Zone() {
		// TODO Auto-generated constructor stub
	}
	
	public Zone(String nom, Integer capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.animaux = new ArrayList<>();
	}

	String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	
}
