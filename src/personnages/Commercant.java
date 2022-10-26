package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonPref, int argent) {
		super(nom , boissonPref = "Thé" , argent);
	}
	
	public void seFaireExtorquer() {
		argent = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
	}
	
	public void recevoir(int argentRecu) {
		argent = argent + argentRecu;
		parler(argentRecu + " sous ! Je te remercie généreux donateur!");
	}
	
}
