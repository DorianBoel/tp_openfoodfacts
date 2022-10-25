package tp_openfoodfacts;

public class Ingredients {

	
	private String libelle;
	public Ingredients(String libelle) {
		//Creez une classe Ingredient avec un attribut libelle
		this.libelle = libelle;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	@Override
	public String toString() {
		return "ingredients [libelle=" + libelle + "]";
	}

}
