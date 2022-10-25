package tp_openfoodfacts;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import tp_openfoodfacts.entites.Produit;

public class Stock {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\v.fournier\\OneDrive\\Documents\\Mydiginamic\\open-food-facts.csv");

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

//	
//	for (int i=1;i<lines.size();i++) { 
//		String product = lines.get(i);
//		String[] tokens=product.split(";");
//		Produit p = new Produit (tokens[3], tokens[1],tokens[4]); // actiellement tokens 1 est en string et token 4 aussi
//	}
//	while (lines.hasNext()) {
//	//	produits.add(new Produit(lines.getLibelle(),lines.getCategorie(),lines.getNutriScore());
//		produit.add(new Produit(libelle,categorie,nutriScore);
	}

}
