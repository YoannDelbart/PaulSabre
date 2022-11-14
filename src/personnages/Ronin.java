package personnages;

public class Ronin extends Humain{
	private int honneur;

	public Ronin(String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int donArgent = getArgent()/10;

		if (donArgent > 0) {
			parler(beneficiaire.getNom() + " prend ces " + donArgent + " sous.");
			perdreArgent(donArgent);
			beneficiaire.recevoir(donArgent);
		} else {
			parler("Je n'ai pas assez d'argent pour t'en donner.");
		}
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa !");
			gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			int argentPerdu = getArgent();
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur--;
			adversaire.gagner(argentPerdu);
		}
	}

}
