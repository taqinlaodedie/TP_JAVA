import java.util.*;

public class Carte {
	ArrayList<Personnage> lt;
	Personnage cour;
	String nom;

	public Carte(String nom) {
		lt = new ArrayList<Personnage>();
		this.nom = nom;
	}
	/*ajouter un personnage*/
	public boolean add(Personnage nouveau) {
		return lt.add(nouveau);
	}
	/*supprimer le personnage voulu*/
	public boolean remove(Personnage e) {
		return lt.remove(e);
	}
	/*retourner aleatoirement un personnage dans la carte*/
	public Personnage nextPerso() {	
		Random rand;
		rand = new Random();
		int index = rand.nextInt(lt.size());
		return lt.get(index);
	}
	/*detecter si la liste est vide*/
	public boolean isEmpty() {
		return lt.isEmpty();
	}
	/*si un personnage est mort, on le supprime*/
	private void supprimerMort() {
		Iterator<Personnage> it;
		it = lt.iterator();
		while(it.hasNext()) {
			cour = it.next();
			if(cour.getPV() < 0) {
				lt.remove(cour);
				//System.out.println("supprimer " + cour.getNom());
				it = lt.iterator();
			}
		}
	}
	/*combattre avec la carte contre, si un personnage est mort, on le supprime*/
	public void jouer(Carte contre) {
		Iterator<Personnage> it;
		//supprimer les morts avant de commencer
		this.supprimerMort();
		it = lt.iterator();
		while(it.hasNext()) {
			//supprimer les morts des enemies avant de les attaquer
			contre.supprimerMort();
			cour = it.next();
			if(cour instanceof ICombat) {
				//detecter si les enemies sont tous morts
				if(contre.isEmpty() == false) {
					((ICombat)cour).combattre(contre.nextPerso());		
				}
				else {
					//les enemies ont echoues
					contre.detectRes();
				}
			}
			if(cour instanceof ISoin) {
				((ISoin)cour).soigner(this.nextPerso());
			}
		}
	}
	/*donner une distance aleatoirement a chaques personnages*/
	public void setDistance()
	{
		Iterator<Personnage> it;
		it = lt.iterator();
		Random rand;
		rand = new Random();
		while(it.hasNext()) {
			cour = it.next();
			cour.setDistance(rand.nextInt(100));
		}
	}
	/*trier les personnages sans comparator*/
	public void sortPV() {
		Collections.sort(lt);
	}
	/*trier les personnages avec comparator*/
	public void sort() {
		PVComparator cmp = new PVComparator();
		Collections.sort(lt, cmp);
	}
	/*afficher tous les personnages*/
	public void afficher() {
		Iterator<Personnage> it;
		it = lt.iterator();
		System.out.println(nom);
		while(it.hasNext()) {
			System.out.println(it.next().allInfo());
		}
	}
	/*detecter si tous les personnages sont morts, si oui, afficher l'echec et arreter le jeux*/
	public void detectRes() {
		if(lt.isEmpty() == true) {
			System.out.println("echec " + nom);
			System.exit(0);
		}
	}
}