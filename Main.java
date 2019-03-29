//import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//Random rand = new Random();
		Carte carte1, carte2;
		Escrimus escrimus1, escrimus2;
		Archeus archeus1, archeus2;
		Soigneur infirmix1, infirmix2;
		Paladin paladin1, paladin2;

		escrimus1 = new Escrimus("Escrimus1");
		archeus1 = new Archeus("Archeus1");
		infirmix1 = new Soigneur("Infirmix1", 5);
		escrimus2 = new Escrimus("Escrimus2");
		archeus2 = new Archeus("Archeus2");
		infirmix2 = new Soigneur("Infirmix2", 5);
		paladin1 = new Paladin("Paladin1", 15, 2);
		paladin2 = new Paladin("Paladin2", 15, 2);
		carte1 = new Carte("carte1");
		carte2 = new Carte("carte2");

		carte1.add(escrimus1);
		carte1.add(archeus1);
		carte1.add(infirmix1);
		carte1.add(paladin1);
		carte2.add(escrimus2);
		carte2.add(archeus2);
		carte2.add(infirmix2);
		carte2.add(paladin2);
		
		for(int i = 0; i < 500; i++) {
			System.out.println("round " + (i+1));	
			carte1.detectRes();
			carte2.detectRes();
			carte1.setDistance();
			carte2.setDistance();
			carte1.jouer(carte2);
			carte2.jouer(carte1);
			carte1.afficher();
			carte2.afficher();
		}
		/*
		System.out.println("Trier sans comparateur");
		carte1.sortPV();
		carte2.sortPV();
		carte1.afficher();
		carte2.afficher();
		System.out.println("changer leur PV");
		carte1.setDistance();
		carte2.setDistance();
		carte1.jouer(carte2);
		carte2.jouer(carte1);
		System.out.println("Trier avec comparateur");
		carte1.sort();
		carte2.sort();
		carte1.afficher();
		carte2.afficher();*/
		
		//System.out.println(carte1.nextPerso());
	}
}