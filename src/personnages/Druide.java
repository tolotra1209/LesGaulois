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
	
}
