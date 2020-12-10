package fr.diginamic.factory.entities.factories;

import fr.diginamic.factory.entities.ObjetConnecte;
import fr.diginamic.factory.enums.ELimitVolt;

public interface IObjectConnecteFactory {
	public ObjetConnecte getInstance(ELimitVolt limitVolt);
}