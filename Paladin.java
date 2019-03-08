public class Paladin extends Personnage implements Combat, Soin {
	int attaque, soin;

	public Paladin(String nom, int attaque, int soin) {
		super(nom,120);
		this.attaque = attaque;
		this.soin = soin;
	}
	public String allInfo() {
		return ("Paladin " + super.getNom() + ":" + "PV: " + super.getPV() + "/" + super.getLimitePV() + " attaque: " + attaque + " soin: " + soin + " distance: " + super.getDistance());
	}
	public void soigner(Personnage objet){
		System.out.println(super.getNom() + " soigne " + objet.getNom());
		objet.gainPV(soin);
	}
	public void combattre(Personnage objet){
		System.out.println(super.getNom() + " attaque " + objet.getNom());
		try{
			objet.pertePV(attaque);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}