import java.util.*;

public class Collection {
	List<Personnage> maCollection;
	Random rand = new Random();

	public Collection() {
		maCollection = new ArrayList<Personnage>();
	}
	public void add(Personnage nouveau) {
		maCollection.add(nouveau);
	}
	public Personnage rand() {	
		int index = rand.nextInt(maCollection.size());
		return maCollection.get(index);
	}
	public List<Personnage> all() {
		return maCollection;
	}
}