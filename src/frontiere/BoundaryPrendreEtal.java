package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		if(!nomVendeurConnu) {
			System.out.println("Je suis désolée " + nomVendeur + " mais il faut être un habitant de notre village pour commercer ici.");
		}
		else {
			System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux vous trouver un étal.");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if(!etalDisponible) {
				System.out.println("Désolée " + nomVendeur + " je n'ai plus d'étal qui ne soit pas déjà occupé.");
			}
			else {
				installerVendeur(nomVendeur);
				System.out.println("C'est parfait, il me reste un étal pour vous !");
				StringBuilder question = new StringBuilder();
				question.append("Il me faudrait quelques renseignements :");
				String produit = Clavier.entrerChaine("Quels produits souhaitez-vous vendre ?");
				
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
