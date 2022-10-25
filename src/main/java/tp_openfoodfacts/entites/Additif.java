package tp_openfoodfacts.entites;

public class Additif {
	
	private String numeroE;
	
	private String nom;
	
	public Additif(String numeroE, String nom) {
		this.numeroE = numeroE;
		this.nom = nom;
	}

	public String getNumeroE() {
		return numeroE;
	}

	public String getNom() {
		return nom;
	}
	
}
