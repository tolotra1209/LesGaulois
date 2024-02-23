package personnages;

public class Gaulois extends Personnage{
	private int puissancePotion;
	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	
	@Override
	protected String donnerAuteur() {
		return "gaulois ";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	
	@Override
	public void frapper(Personnage adversaire) {
		if (force > 0) {
			System.out.println( "Le "+donnerAuteur()+nom + " donne un grand coup de force "+ force/3 + " au "+ adversaire.donnerAuteur()+adversaire.getNom() );
			adversaire.recevoirCoup(force/3);
			
			if (puissancePotion>1) {
				puissancePotion=(int) (puissancePotion-(0.5));
				this.force=force*puissancePotion;
				
			}
		}
	}

}
