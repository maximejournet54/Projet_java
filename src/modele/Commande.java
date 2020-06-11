	package modele;


import java.util.ArrayList;
import java.util.Date;

public final class Commande  {

	private static int nocommande=0;
	static ArrayList<Emprunt>CollectionEmprunt;
	
	public Commande() {
		CollectionEmprunt = new ArrayList<Emprunt>();
		setNocommande(getNocommande() + 1);
	}

	public static void SupprimerEmprunt(Emprunt e){
		CollectionEmprunt.remove(e);
	}

	public int getNocommande() {
		return nocommande;
	}

	private static void setNocommande(int newnocommande) {
		nocommande = newnocommande;
	}


	public static void AjouterEmprunt(Date d, Date d1, float montant) {
		Emprunt e=new Emprunt(d, d1, montant);
		CollectionEmprunt.add(e);
		
	}
    
}
