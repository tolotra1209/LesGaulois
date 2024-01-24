package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	
	public void parler(String texte) {
		System.out.println("Le "+ donnerAuteur() + nom + " : \"" + texte +"\" ");
		
	}
	
	public void frapper(Personnage adversaire){
		if (force>0) {
			System.out.println("Le "+donnerAuteur() +nom + " envoie un grand coup dans la machoîre de "+ adversaire.getNom());
			adversaire.recevoirCoup(force/3);
		}
		
	}
	
	public void recevoirCoup(int forceCoup){
		force = force - forceCoup;

		if (force>0) {
			parler("Aie !");
		} else {
			force = 0;
			parler("J'abandonne");
		}

	}
	
	protected abstract String donnerAuteur();
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
	}


}
