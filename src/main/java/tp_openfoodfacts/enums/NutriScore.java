package tp_openfoodfacts.enums;




public enum NutriScore {
	

	A ("a"), B("b"), C("c"), D("d"), E("e"), F("f");

	private String libelle;

	private NutriScore(String libelle) {
		this.libelle = libelle;
	}

	static NutriScore affichage(String lib) {

		NutriScore[] nutSco = NutriScore.values();
		for (NutriScore n : nutSco) {
			if (n.getLibelle().equalsIgnoreCase(lib)) {
				return n;
			}

		}
		return null;

	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
