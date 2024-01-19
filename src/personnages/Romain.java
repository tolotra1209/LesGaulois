package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le Romain "+ nom + " : \"" + texte +"\" ");
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
}
