package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	private ControlVerifierIdentite cvi;
	private ControlEmmenager cm;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 5);
		village.setChef(new Chef("LeChef", 1, village));
		cvi = new ControlVerifierIdentite(village);
		cm = new ControlEmmenager(village);
	}

	@Test
	void testIdentite() {
		cm.ajouterGaulois("Bonemine", 1);
		assertTrue(cvi.verifierIdentite("Bonemine"));
		assertFalse(cvi.verifierIdentite("César"));
	}

}
