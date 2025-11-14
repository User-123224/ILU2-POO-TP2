package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherMarcheTest {
	private ControlAfficherMarche cam;
	private ControlEmmenager cm;
	private ControlPrendreEtal cpe;
	private ControlVerifierIdentite cvi;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 5);
		village.setChef(new Chef("LeChef", 1, village));
		cam = new ControlAfficherMarche(village);
		cm = new ControlEmmenager(village);
		cvi = new ControlVerifierIdentite(village);
		cpe = new ControlPrendreEtal(cvi, village);
	}

	@Test
	void test() {
		String[] marche1 = new String[]{};
		assertArrayEquals(marche1, cam.donnerInfosMarche());
		String[] marche2 = new String[]{"Bonemine","10","fleurs"};
		cm.ajouterGaulois("Bonemine", 3);
		cpe.prendreEtal("Bonemine", "fleurs", 10);
		assertArrayEquals(marche2, cam.donnerInfosMarche());
	}

}
