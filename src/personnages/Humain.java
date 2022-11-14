package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;

	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	
	protected void parler(String texte) {
		System.out.println(nom + " - " +texte);
	}	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPref + ".");
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + boissonPref + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (argent>=prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux pas m'offrir " + bien + " � " + prix + " sous.");
		}
	}

}
