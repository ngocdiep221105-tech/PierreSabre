package personnages;

public class Ronin extends Humain{
	public Ronin(String nom,String boisson,int argent) {
		super(nom,boisson,argent);
	}
	public void donner(Commercant beneficiaire) {
		int argentDon=getArgent();
		argentDon=argentDon*10/100;
		perdreArgent(argentDon);
		parler(beneficiaire.getNom()+" prends ces "+argentDon+" sous.");
		beneficiaire.recevoir(argentDon);
	}
}
