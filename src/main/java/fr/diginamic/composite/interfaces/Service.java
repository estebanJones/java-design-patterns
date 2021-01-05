package fr.diginamic.composite.interfaces;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.composite.enums.EType;

public class Service implements IComponent {
	private List<IComponent> employesServices = new ArrayList<>();
	
	
	public Service() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Double calculerSalaire() {
		return this.employesServices.stream().mapToDouble(e -> e.calculerSalaire()).sum();
	}

	
	public List<IComponent> getEmployesServices() {
		return employesServices;
	}


	public void setEmployesServices(List<IComponent> employesServices) {
		this.employesServices = employesServices;
	}


	@Override
	public EType getType() {
		return EType.SERV;
	}

}
