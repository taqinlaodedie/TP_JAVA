import java.util.*;

public abstract class Personnage {
	private int PV, distance, limitePV;
	private String nom;

	public Personnage(String nom, int PV) {
		this.nom = nom;
		Random rand = new Random();
		this.PV = rand.nextInt(PV);
		limitePV = this.PV;
	}
	protected void finalize() throws Exception{
		throw new Exception(nom + " meurt");
	}
	abstract String allInfo();
	public String getNom(){
		return nom;
	}
	public int getPV() {
		return PV;
	}
	public void setPV(int PV) {
		this.PV = PV;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDistance() {
		return distance;
	}
	public void pertePV(int val) throws Exception {
		PV -= val;
		if(PV <= 0)
			this.finalize();
		System.out.println(this.allInfo());
	}
	public void gainPV(int val) {
		PV += val;
		if(PV > limitePV) 
			PV = limitePV;
		System.out.println(this.allInfo());
	}
	public int getLimitePV() {
		return limitePV;
	}
}