package histoire;

import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant ("Marco", "thé", 20);
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.gagnerArgent(15);
		marco.boire();
		

	}

}
