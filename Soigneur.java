public class Soigneur extends Personnage implements ISoin {
	private int soin;

	public Soigneur(String nom, int soin) {
		super(nom,100);
		this.soin = soin;
	}
	public String allInfo() {
		return ("Soigneur " + this.getNom() + ":" + "PV: " + this.getPV() + "/" + this.getLimitePV() + " Soin: " + soin + " distance: " + this.getDistance());
	}
	public void soigner(Personnage objet){
		//System.out.println(this.getNom() + " soigne " + objet.getNom());
		objet.gainPV(soin);
	}
	public String toString() {
		return (this.getNom() + "(Soigneur)\n" + "PV: " + this.getPV() + "\n" + "points de soin: " + this.soin);
	}
}