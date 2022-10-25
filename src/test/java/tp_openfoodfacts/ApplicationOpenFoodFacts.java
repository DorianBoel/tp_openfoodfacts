package tp_openfoodfacts;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import tp_openfoodfacts.entites.Produit;
import tp_openfoodfacts.enums.NutriScore;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Produit> produit = new ArrayList<Produit>();
		
		Path path = Paths.get("C:/Users/maxen/Documents/open-food-facts.csv");

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

	
	for (int i=1;i<lines.size();i++) { 
		String[] tokens=lines.get(i).split("|");
		produit.add(new Produit (tokens[3], new Categorie(tokens[1]) , new NutriScore(tokens[4])));
	}
	
	System.out.println(produit);
//	while (lines.hasNext()) {
//	//	produits.add(new Produit(lines.getLibelle(),lines.getCategorie(),lines.getNutriScore());
//		produit.add(new Produit(libelle,categorie,nutriScore);
		
	}
}
