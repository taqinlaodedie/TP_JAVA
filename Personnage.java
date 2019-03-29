import java.util.*;

public abstract class Personnage implements Comparable<Personnage> {
	protected int PV, distance, limitePV;
	protected String nom;

	/*creation d'un personnage*/
	public Personnage(String nom, int PV) {
		this.nom = nom;
		Random rand = new Random();
		this.PV = rand.nextInt(PV);
		limitePV = this.PV;
	}
	/*afficher tous les informations du personnage*/
	abstract String allInfo();
	/*retourner le nom*/
	public String getNom(){
		return nom;
	}
	/*retourner le point de vie*/
	public int getPV() {
		return PV;
	}
	/*mettre son PV*/
	public void setPV(int PV) {
		this.PV = PV;
	}
	/*donner une distance au personnage*/
	public void setDistance(int distance) {
		this.distance = distance;
	}
	/*retourner la distance*/
	public int getDistance() {
		return distance;
	}
	/*a utiliser en attaque*/
	public void pertePV(int val) throws PVException {
		PV -= val;
		if(PV <= 0)
			throw new PVException(this);
		//System.out.println(this.allInfo());
	}
	/*en utiliser en soigner*/
	public void gainPV(int val) {
		PV += val;
		if(PV > limitePV) 
			PV = limitePV;
		//System.out.println(this.allInfo());
	}
	/*retourner la valeur maximale de PV du personnage*/
	public int getLimitePV() {
		return limitePV;
	}
	/*comparer le PV du personnage avec l'objet*/
	public int compareTo(Personnage objet) {
		return Integer.compare(PV, objet.getPV());
	}
}