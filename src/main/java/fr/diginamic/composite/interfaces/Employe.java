package fr.diginamic.composite.interfaces;

import fr.diginamic.composite.enums.EType;

public class Employe implements IComponent {
	private Double salaire;
	private EType type;
	
	public Employe(Double salaire) {
		this.salaire = salaire;
		this.type = EType.EMP;
	}
	
	

	@Override
	public Double calculerSalaire() {
		// TODO Auto-generated method stub
		return this.salaire;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public EType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}
	
	

}
