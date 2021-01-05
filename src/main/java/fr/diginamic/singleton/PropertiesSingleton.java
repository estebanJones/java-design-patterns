package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class PropertiesSingleton {
	private String dbUrl;
	private String dbUser;
	private String dbPass;
	
	private PropertiesSingleton() {
		ResourceBundle fichierConf = ResourceBundle.getBundle("db");
//		this.dbUrl = fichierConf.getString(key);
//		this.dbUser = fichierConf.getString(key);
		
	}
	
	private static PropertiesSingleton INSTANCE = new PropertiesSingleton();
	public static PropertiesSingleton getInstance() {
		return INSTANCE;
	}
	
	
}
