public class Archeus extends Guerrier implements ICombat {
	public Archeus(String nom) {
		super(nom, 15);
	}
	/*cobattre avec le personnage objet*/
	public void combattre(Personnage objet) {
		//System.out.println(this.getNom() + " attaque " + objet.getNom());
		if(Math.abs(this.getDistance() - objet.getDistance()) >= 50)
			this.setAttaque(20);
		else
			this.setAttaque(15);
		try{
			objet.pertePV(this.getAttaque());
		}
		catch(PVException e) {
			System.out.println(e.getMessage());
			//System.exit(0);
		}
	}
}