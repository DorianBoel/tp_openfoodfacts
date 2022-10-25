package tp_openfoodfacts.entites;

import java.util.HashSet;
import java.util.Set;

import tp_openfoodfacts.Categorie;
import tp_openfoodfacts.Marque;
import tp_openfoodfacts.enums.NutriScore;

public class Produit {
	
	private String libelle;
	
	private Categorie categorie;
	
	private NutriScore nutriScore;
	
	private Set<Ingredients> ingredients = new HashSet<>();
	
	private Set<Allergene> allergenes = new HashSet<>();
	
	private Set<Marque> marques = new HashSet<>();
	
	private Set<Additif> additifs = new HashSet<>();
	
	public Produit(String libelle, Categorie categorie, NutriScore nutriScore) {
		this.libelle = libelle;
		this.categorie = categorie;
		this.nutriScore = nutriScore;
	}

	public String getLibelle() {
		return libelle;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public NutriScore getNutriScore() {
		return nutriScore;
	}

	public Set<Ingredients> getIngredients() {
		return ingredients;
	}

	public Set<Allergene> getAllergenes() {
		return allergenes;
	}

	public Set<Marque> getMarques() {
		return marques;
	}

	public Set<Additif> getAdditifs() {
		return additifs;
	}
	
}
