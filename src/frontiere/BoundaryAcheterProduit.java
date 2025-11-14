package frontiere;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		String choix_produit = Clavier.entrerChaine("Quels produits voulez-vous achetez ?");
		StringBuilder questionVendeur = new StringBuilder();
		questionVendeur.append("Chez quel commerçant voulez-vous acheter des " + choix_produit + " ?");
		String[] nomsVendeurs = controlAcheterProduit.trouverNomsVendeurs(choix_produit);
		for(int i = 0; i < nomsVendeurs.length; i++) {
			questionVendeur.append((i+1) + " - " + nomsVendeurs[i]);
		}
		int choix_vendeur = Clavier.entrerEntier(questionVendeur.toString());
	}
}
