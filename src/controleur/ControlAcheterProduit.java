package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	//private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	//private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(
//			ControlVerifierIdentite controlVerifierIdentite,
//			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		//this.controlVerifierIdentite = controlVerifierIdentite;
		//this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public String[] trouverNomsVendeurs(String produit) {
		Gaulois[] vendeurs = village.rechercherVendeursProduit(produit);
		String[] nomsVendeurs = new String[vendeurs.length];
		for(int i = 0; i < vendeurs.length; i++) {
			nomsVendeurs[i] = vendeurs[i].getNom();
		}
		return nomsVendeurs;
	}
}
