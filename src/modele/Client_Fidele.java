package modele;

import java.util.UUID;

public class Client_fidele extends Personne {
	
	/**
	 * la reduction d'un client fidele
	 * 
	 * @see Client_fidele#getReduction()
	 */
	private final double reduction = 0.1;
	

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
	 * @see Client_fidele reduction
	 * @see Personne#idpersonne
	 * @see Personne#nom
	 * @see Personne#prenom 
	 */
	public Client_fidele(UUID idpersonne, String nom, String prenom) {
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
