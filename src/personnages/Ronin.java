package personnages;

public class Ronin extends Humain{
	private int honneur=1;

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
	
	public void provoquer(Yakuza adversaire) {
		int force=honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force>=adversaire.getReputation()) {
			gagnerArgent(adversaire.getArgent());
			honneur++;
			parler(" Je t’ai eu petit yakusa!");
		}
		else {
			perdreArgent(getArgent());
			honneur--;
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
		}
	}
}
