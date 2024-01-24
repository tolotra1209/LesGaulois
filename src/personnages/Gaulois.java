package personnages;

public class Gaulois extends Personnage {
	private Gaulois[] gaulois = new Gaulois[50];

	public Gaulois(String nom, int force) {
		super("Asterix", 8);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected String donnerAuteur() {
		return "gaulois ";
	}
	
}
