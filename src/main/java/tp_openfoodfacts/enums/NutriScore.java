package tp_openfoodfacts.enums;

public class NutriScore {

//	A("A"),
//	B("B"),
//	C("C"),
//	D("D"),
//	E("E"),
//	F("F");
	
	private String nutriScore;
	
	public NutriScore(String nutriScore) {
		this.nutriScore=nutriScore;
	}
	
	/** Getter pour nutriScore
	 * @return the nutriScore
	 */
	public String getNutriScore() {
		return nutriScore;
	}

	/** Setter pour nutriScore
	 * @param nutriScore the nutriScore to set
	 */
	public void setNutriScore(String nutriScore) {
		this.nutriScore = nutriScore;
	}
	
}

	
