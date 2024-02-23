package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",5);
		Soldat minus = new Soldat("Minus", Grade.SOLDAT,6);
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois obelix = new Gaulois("Obelix",15);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		
		Druide panoramix = new Druide("Panoramix",5);
		panoramix.fabriquerPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonix);
		
		
		//System.out.println(asterix.getNom());
		
		asterix.parler("Bonjour à tous");
		minus.parler("Un Gau .. Gaugole");
		
		
		/*for (int i = 0; i<2; i++) {
			minus.recevoirCoup(3);
		}*/
		
		for (int i = 0; i<3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}
}
