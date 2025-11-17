package personnages;

//import java.util.Iterator;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	private int nbConnaissance;
	private Humain[] memoire;
	private static final int MAX=30;
	public Humain(String nom,String boisson, int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du" + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de" + boisson +"! GLOUPS !");
	}
	
	public void gagnerArgent(int gain){
		argent+=gain;
	}
	
	public void perdreArgent(int perte){
		argent-=perte;
	}

	public void acherter(String bien, int prix) {
		if (prix<=argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + "sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
		}
	}
	public void parler(String texte) {
		System.out.println("("+nom+")-" + texte);
	}
	
	private void memoriser(Humain humain) {
		if(nbConnaissance<MAX) {
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}
		else {
			for (int i = 0; i < MAX-1; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[MAX-1]=humain;
		}
	}
	
	private void reponse(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.reponse(this);
		memoriser(autreHumain);
	}
	
//	public void listerConnaissance() {
//		String lis="";
//		for (int i = 0; i < nbConnaissance; i++) {
//			lis+=memoire[i];
//			lis+=',';
//		}
//		parler("Je connais beaucoup de monde dont : "+lis);
//	}
}
