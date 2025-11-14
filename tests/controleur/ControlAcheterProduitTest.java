package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAcheterProduitTest {
	private ControlAcheterProduit cap;
	private ControlEmmenager cm;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("LeVillage", 10, 5);
		village.setChef(new Chef("LeChef", 1, village));
		cap = new ControlAcheterProduit(village);
	}

	@Test
	void test() {
//		String[] noms = new String[] {"Bonemine", "Obélix","Idéfix"};
	}

}
