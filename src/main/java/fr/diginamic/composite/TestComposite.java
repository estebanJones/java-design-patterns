package fr.diginamic.composite;

import fr.diginamic.composite.interfaces.Employe;
import fr.diginamic.composite.interfaces.IComponent;
import fr.diginamic.composite.interfaces.Service;

public class TestComposite {

	public TestComposite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			Service dsin = new Service();
			IComponent celine = new Employe(100000.0);
			IComponent bilel = new Employe(8000.0);
			dsin.getEmployesServices().add(celine);
			dsin.getEmployesServices().add(bilel);
			
			Service bigData = new Service();
			IComponent jb = new Employe(7500.0);
			IComponent jane = new Employe(3500.0);
			bigData.getEmployesServices().add(jb);
			bigData.getEmployesServices().add(jane);
			
			Service javaDev = new Service();
			IComponent kevin = new Employe(7500.0);
			IComponent paul = new Employe(3500.0);
			bigData.getEmployesServices().add(kevin);
			bigData.getEmployesServices().add(paul);
			
			dsin.getEmployesServices().add(bigData);
			dsin.getEmployesServices().add(javaDev);
			
			System.out.println(dsin.calculerSalaire());

	}

}
