package fr.diginamic.factory.entities.factories;

import fr.diginamic.factory.entities.EnceinteConnecte;
import fr.diginamic.factory.entities.ObjetConnecte;
import fr.diginamic.factory.entities.Tablette;
import fr.diginamic.factory.entities.TelephonePortable;
import fr.diginamic.factory.enums.ELimitVolt;

public class ObjetConnecteFactory implements IObjectConnecteFactory {
	
	@Override
	public ObjetConnecte getInstance(ELimitVolt limitVolt) {
		ObjetConnecte objetConnecte = null;
		switch (limitVolt) {
		case EnceinteConnecte:
			objetConnecte = new EnceinteConnecte(limitVolt.getLimitVolt());
		case Tablette:
			objetConnecte = new Tablette(limitVolt.getLimitVolt());
		case TelephonePortable:
			objetConnecte = new TelephonePortable(limitVolt.getLimitVolt());
		default:
			break;
		}
		return objetConnecte;
	}
}
