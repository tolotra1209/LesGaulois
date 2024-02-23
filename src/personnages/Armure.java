package personnages;

public enum Armure {
	CASQUE("casque",2), PLASTRON("plastron",3), BOUCLIER("bouclier",3);
	private String nom;
	private int force;
	
	private Armure(String nom,int force) {
		this.nom = nom;
		this.force=force;
	}
	@Override
	public String toString() {
		return nom;
	}
	public int getForce() {
		return force;
	}
}
