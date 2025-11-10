package histoire;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain humain=new Humain("Prof"," kombucha",54);
		humain.direBonjour();
		humain.acherter("une boisson", 12);
		humain.boire();
		humain.acherter("un jeu", 2);
		humain.acherter("un kimono", 50);
	}
}
