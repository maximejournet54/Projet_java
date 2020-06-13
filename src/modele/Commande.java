	package modele;


import java.util.ArrayList;
import java.util.Date;

public final class Commande  {

	/**
	 * le numero de commande
	 * 
	 * @see Commande#getNocommande()
	 * @see Commande#setNocommande()
	 */
	private static int nocommande=0;
	
	/**
	 * la collection qui contient les emprunts
	 * 
	 * @see Commande#AjouterEmprunt(Date, Date, float)
	 * @see Commande#SupprimerEmprunt(Emprunt)
	 */
	static ArrayList<Emprunt>CollectionEmprunt;
	
	/**
	 * constructeur
	 * 
	 * @see Commande#CollectionEmprunt
	 * 
	 */
	public Commande() {
		CollectionEmprunt = new ArrayList<Emprunt>();
		setNocommande(getNocommande() + 1);
	}

	
	/**
	 * retourne le numero de commande
	 * 
	 * @return le numero de commande
	 */
	public int getNocommande() {
		return nocommande;
	}

	/**
	 * definit le numero de commande
	 * 
	 * @param newcommande
	 * 					le numero de commande
	 */
	private static void setNocommande(int newnocommande) {
		nocommande = newnocommande;
	}

	/**
	 * ajoute un emprunt
	 * 
	 * @param d
	 * 			date de debut
	 * @param d1
	 * 			date de fin
	 */
	public static void AjouterEmprunt(Date d, Date d1, float montant) {
		Emprunt e=new Emprunt(d, d1, montant);
		CollectionEmprunt.add(e);
	}
	
	/**
	 * supprime un emprunt
	 * 
	 * @param e
	 * 			Emprunt en cours
	 * 
	 * @see Commande#CollectionEmprunt
	 */
	public static void SupprimerEmprunt(Emprunt e){
		CollectionEmprunt.remove(e);
	}
    
}
