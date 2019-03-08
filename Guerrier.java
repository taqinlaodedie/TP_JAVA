public abstract class Guerrier extends Personnage {
	private int attaque;

	public Guerrier(String nom, int attaque) {
		super(nom,150);
		this.attaque = attaque;
	}
	public String allInfo() {
		return ("Guerrier " + super.getNom() + ":" + "PV: " + super.getPV() + "/" + super.getLimitePV() + " attaque: " + attaque + " distance: " + super.getDistance());
	}
	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}
	public int getAttaque() {
		return attaque;
	}
	public void combattre(Personnage objet) {
		System.out.println(super.getNom() + " attaque " + objet.getNom());
		try{
			objet.pertePV(this.getAttaque());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	public String toString() {
		return (super.getNom() + "(Geurrier)\n" + "PV: " + super.getPV() + "\n" + "points d'attaque: " + this.getAttaque());
	}
}