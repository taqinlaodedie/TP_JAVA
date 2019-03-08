public class Soigneur extends Personnage implements Soin {
	private int soin;

	public Soigneur(String nom, int soin) {
		super(nom,100);
		this.soin = soin;
	}
	public String allInfo() {
		return ("Soigneur " + super.getNom() + ":" + "PV: " + super.getPV() + "/" + super.getLimitePV() + " Soin: " + soin + " distance: " + super.getDistance());
	}
	public void soigner(Personnage objet){
		System.out.println(super.getNom() + " soigne " + objet.getNom());
		objet.gainPV(soin);
	}
	public String toString() {
		return (super.getNom() + "(Soigneur)\n" + "PV: " + super.getPV() + "\n" + "points de soin: " + this.soin);
	}
}