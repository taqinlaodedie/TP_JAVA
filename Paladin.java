public class Paladin extends Personnage implements ICombat, ISoin {
	int attaque, soin;

	public Paladin(String nom, int attaque, int soin) {
		super(nom,120);
		this.attaque = attaque;
		this.soin = soin;
	}
	public String allInfo() {
		return ("Paladin " + this.getNom() + ":" + "PV: " + this.getPV() + "/" + this.getLimitePV() + " attaque: " + attaque + " soin: " + soin + " distance: " + this.getDistance());
	}
	public void soigner(Personnage objet){
		//System.out.println(super.getNom() + " soigne " + objet.getNom());
		objet.gainPV(soin);
	}
	public void combattre(Personnage objet){
		//System.out.println(super.getNom() + " attaque " + objet.getNom());
		try{
			objet.pertePV(attaque);
		}
		catch(PVException e) {
			System.out.println(e.getMessage());
			//System.exit(0);
		}
	}
	public String toString() {
		return (super.getNom() + "(Paladin)\n" + "PV: " + super.getPV() + "\n" + "points de soin: " + this.soin + "\n" + "points d'attaque: " + this.attaque);
	}
}