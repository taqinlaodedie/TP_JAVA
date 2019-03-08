import java.util.*;

public class Main {
	public static void main(String[] args) {
		//Random rand = new Random();
		Escrimus escrimus;
		Archeus archeus;
		Soigneur infirmix;
		Collection maCollection;

		escrimus = new Escrimus("Escrimus");
		archeus = new Archeus("Archeus");
		infirmix = new Soigneur("Infirmix", 5);
		/*
		for(int i = 0; i < 500; i++) {
			archeus.setDistance(rand.nextInt(100));
			escrimus.combattre(archeus);
			archeus.combattre(escrimus);
			infirmix.soigner(escrimus);
		}*/
		maCollection = new Collection();

		maCollection.add(escrimus);
		maCollection.add(archeus);
		maCollection.add(infirmix);
		System.out.println(maCollection.rand().toString());

		//System.out.println("Personne n'est morte");
	}
}