package personnages;

public class Commercant extends Humain{
	public Commercant(String nom,String boisson,int argent) {
		super(nom,"Thé",argent);
	}
	
	public int seFaireExtorquer() {
		int agentExtorque=getArgent();
		perdreArgent(agentExtorque);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return agentExtorque;
	}
	
	public void recevoir(int argent) {
		parler(argent+"  sous ! Je te remercie généreux donateur!");
	}
}
