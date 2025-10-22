package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		boolean vendeurReconnu = controlLibererEtal.isVendeur(nomVendeur);
		if(!vendeurReconnu) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !\n");
		}
		else {
			String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
			if(donneesEtal[0].equals("true")) {
				StringBuilder auRevoir = new StringBuilder();
				auRevoir.append("Vous avez vendu " + donneesEtal[4] + " sur " + donneesEtal[3] + " " + donneesEtal[2] + ".");
				auRevoir.append("Au revoir " + nomVendeur + " passez une bonne journée.");
				System.out.println(auRevoir.toString());
			}
		}
	}

}
