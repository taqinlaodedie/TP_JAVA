public class Archeus extends Guerrier{
	public Archeus(String nom) {
		super(nom, 15);
	}
	public void combattre(Personnage objet) {
		System.out.println(super.getNom() + " attaque " + objet.getNom());
		if(Math.abs(super.getDistance() - objet.getDistance()) >= 50)
			super.setAttaque(20);
		else
			super.setAttaque(15);
		try{
			objet.pertePV(super.getAttaque());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}