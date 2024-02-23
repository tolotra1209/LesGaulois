package personnages;

public class Druide extends Gaulois {
	private int puissancePotion;
	private int dosesPotion;
	
	public Druide(String nom, int force) {
		super(nom, force);
	}
	
	public void fabriquerPotion(int doses) {
		dosesPotion=doses;
		puissancePotion=2+(int)(Math.random()*3);
		this.parler("J'ai concocté "+dosesPotion+" doses de potion magique. "+"Elle a une force de "+puissancePotion+"." );
	}
	
	public void donnerPotion(Gaulois gaulois) {
		if (((gaulois.getNom())!= "Obélix")&&(dosesPotion>0)) {
			this.parler("Tiens "+gaulois.getNom()+" un peu de potion magique.");
		}else if((gaulois.getNom())== "Obélix"){
			this.parler("Non, Obélix Non !... Et tu le sais très bien !");
		}else {
			this.parler("Désolé "+gaulois.getNom()+" il n'y a plus une seule goutte de potion.");
		}
	}
	
}
