import java.util.*;

class PVComparator implements Comparator<Personnage> {
	public int compare(Personnage p1, Personnage p2) {
		return Integer.compare(p1.getPV(), p2.getPV());
	}
}