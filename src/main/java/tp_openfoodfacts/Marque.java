package tp_openfoodfacts;

public class Marque {

	private String nom;
	
	public Marque(String nom) {
		this.nom=nom;
	}

	/** Getter pour marque
	 * @return the marque
	 */
	public String getMarque() {
		return nom;
	}

	/** Setter pour marque
	 * @param marque the marque to set
	 */
	public void setMarque(String nom) {
		this.nom = nom;
	}
	
	
	
}
