package histoire;

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
	
	public String getBoissonPref() {
		return boissonPref;
	}
	
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'apelle " + nom + " et j'aime boire du " + boissonPref);
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + boissonPref + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent<prix) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offir un kimono à" + prix + " sous");
		} else {
			parler("J'ai " + argent +" sous en poche. Je vais pouvoir m'offir " + bien + " à " + prix + " sous");
			argent = argent - prix;
		}
	}
	
	
	public void gagnerArgent(int gain) {
		argent = argent + gain ;
	}
	
	
	public void perdreArgent(int perte) {
		argent = argent - perte;
	}
	
}
