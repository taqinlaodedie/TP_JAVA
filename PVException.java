public class PVException extends Exception {
	public PVException() {
		super("PV < 0");
	}
	public PVException(Personnage perso) {
		super(perso.getNom() + ": PV < 0");
	}
}