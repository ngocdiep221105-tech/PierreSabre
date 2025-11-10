package histoire;
import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain humain=new Humain("Prof"," kombucha",54);
		humain.direBonjour();
		humain.acherter("une boisson", 12);
		humain.boire();
		humain.acherter("un jeu", 2);
		humain.acherter("un kimono", 50);
		
		System.out.println("======================================================================================");
		
		Commercant commercant=new Commercant("Marco","Thé",20);
		commercant.direBonjour();
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		commercant.boire();
	}
}
