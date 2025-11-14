package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlLibererEtalTest {
	private ControlLibererEtal cle;
	private ControlTrouverEtalVendeur cv;
	private ControlEmmenager cm;
	private ControlPrendreEtal cpe;
	private ControlVerifierIdentite cvi;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 5);
		village.setChef(new Chef("LeChef", 1, village));
		cv = new ControlTrouverEtalVendeur(village);
		cle = new ControlLibererEtal(cv);
		cm = new ControlEmmenager(village);
		cvi = new ControlVerifierIdentite(village);
		cpe = new ControlPrendreEtal(cvi, village);
	}

	@Test
	void testIsVendeur() {
		assertFalse(cle.isVendeur("Bonemine"));
		cm.ajouterGaulois("Bonemine", 3);
		cpe.prendreEtal("Bonemine", "fleurs", 10);
		assertTrue(cle.isVendeur("Bonemine"));
	}
	
	@Test
	void testDonneesEtal() {
		cm.ajouterGaulois("Bonemine", 3);
		cpe.prendreEtal("Bonemine", "fleurs", 10);
		assertEquals("true",cle.libererEtal("Bonemine")[0]);
		assertEquals("Bonemine",cle.libererEtal("Bonemine")[1]);
		assertEquals("fleurs",cle.libererEtal("Bonemine")[2]);
		assertEquals("10",cle.libererEtal("Bonemine")[3]);
		assertEquals("0",cle.libererEtal("Bonemine")[4]);
	}

}
