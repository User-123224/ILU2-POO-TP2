package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {
	private ControlTrouverEtalVendeur cv;
	private ControlEmmenager cm;
	private ControlVerifierIdentite cvi;
	private ControlPrendreEtal cpe;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 5);
		village.setChef(new Chef("LeChef",1,village));
		cv = new ControlTrouverEtalVendeur(village);
		cm = new ControlEmmenager(village);
		cvi = new ControlVerifierIdentite(village);
		cpe = new ControlPrendreEtal(cvi, village);
	}

	@Test
	void test() {
		assertNull(cv.trouverEtalVendeur("Bonemine"));
		cm.ajouterGaulois("Bonemine", 3);
		cpe.prendreEtal("Bonemine", "fleurs", 10);
		assertNotNull(cv.trouverEtalVendeur("Bonemine"));
	}
	
	@Test
	void testEtalVendeurDifferent(){
		cm.ajouterGaulois("Bonemine", 3);
		cpe.prendreEtal("Bonemine", "fleurs", 10);
		cm.ajouterGaulois("Obélix", 3);
		cpe.prendreEtal("Obélix", "menhir", 3);
		assertNotEquals(cv.trouverEtalVendeur("Bonemine"), cv.trouverEtalVendeur("Obélix"));
	}

}
