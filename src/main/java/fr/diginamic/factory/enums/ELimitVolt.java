package fr.diginamic.factory.enums;

public enum ELimitVolt {
	EnceinteConnecte(200),
	TelephonePortable(50),
	Tablette(100);
	
	private Integer limitVolt;
	
	private ELimitVolt(Integer limitVolt) {
		this.limitVolt = limitVolt;
	}

	public Integer getLimitVolt() {
		return limitVolt;
	}
}
