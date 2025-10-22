package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfosMarche();
		if(infosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard.");
		}
		else {
			System.out.println(nomAcheteur + " vous trouverez au marché :");
			int i = 0;
			do {
				StringBuilder auMarche = new StringBuilder();
				auMarche.append(" - " + infosMarche[i] + " qui vend ");
				i++;
				auMarche.append(infosMarche[i] + " ");
				i++;
				auMarche.append(infosMarche[i] + ".");
				i++;
				System.out.println(auMarche.toString());
			} while(i < infosMarche.length);
		}
	}
}
