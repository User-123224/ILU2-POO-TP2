package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private ControlAfficherVillage cav;
	private ControlEmmenager cm;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 5);
		village.setChef(new Chef("Chef",1,village));village.setChef(new Chef("Chef",1,village));
		cav = new ControlAfficherVillage(village);
		cm = new ControlEmmenager(village);
	}

	@Test
	void testNomVillage() {
		assertEquals("LeVillage", cav.donnerNomVillage());
	}
	
	@Test
	void testNomsVillageois() {
		cm.ajouterGaulois("Bonemine", 1);
		cm.ajouterGaulois("Idéfix", 3);
		//cm.ajouterDruide("Panoramix", 1, 0, 1);
		assertEquals(3, cav.donnerNomsVillageois().length);
		assertArrayEquals(new String[]{"Chef", "Bonemine", "Idéfix"}, cav.donnerNomsVillageois());
	}
	
	@Test
	void testNbEtals() {
		assertEquals(5, cav.donnerNbEtals());
	}

}
