package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

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
		
		System.out.println("======================================================================================");
		Commercant commercant2=new Commercant("Marco","Thé",15);
		Yakuza yakuza=new Yakuza("Yaku Le Noir","whisky",30,"");
		yakuza.direBonjour();
		yakuza.extorquer(commercant2);
		
		System.out.println("======================================================================================");
		
		Ronin ronin=new Ronin("Roro","shochu",60);
		ronin.direBonjour();
		ronin.donner(commercant2);
		
		System.out.println("======================================================================================");
		Commercant commercant3=new Commercant("Marco","Thé",15);
		Yakuza yakuza2=new Yakuza("Yaku Le Noir","whisky",30,"");
		Ronin ronin2=new Ronin("Roro","shochu",60);
		
		yakuza2.extorquer(commercant3);
		ronin2.provoquer(yakuza2);
		
	}
}