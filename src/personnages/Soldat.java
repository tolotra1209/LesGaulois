package personnages;

public class Soldat extends Romain {
	public Grade grade;
	
	public Soldat(String nom,  Grade grade, int force) {
		super(nom, force);
		this.grade = grade;
	}
	
	protected String donnerAuteur() {
		return grade.getNom();
	}
	
	public void equiperArmure(Personnage adversaire,Armure armure) {
		adversaire.parler("Le "+donnerAuteur()+adversaire.getNom() +" s'équipe avec un "+""+".");
	}

}
