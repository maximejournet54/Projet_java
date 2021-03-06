package modele;

import java.util.UUID;

public class Client_Occasionnel extends Personne {
	
	/**
	 * la reduction d'un client occassionnel
	 * 
	 * @see Client_Occasionnel#getReduction()
	 */
	public final static double reduction = 0;

	/**
	 * constructeur
	 * 
	 * @param idpersonne
	 * 					l'identifiant du client
	 * @param nom
	 * 					le nom du client
	 * @param prenom
	 *					le prenom du client
	 *
	 * @see Client_Occasionnel reduction
	 * @see Personne#idpersonne
	 * @see Personne#nom
	 * @see Personne#prenom
	 */
	public Client_Occasionnel(UUID idpersonne, String nom, String prenom) {
		super(idpersonne, nom, prenom);
	}
	
	/**
	 * retourne la reduction du client
	 * 
	 * @return la reduction du client
	 */
	public double getReduction() {
		return reduction;
	}
	
}
