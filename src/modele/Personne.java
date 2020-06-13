package modele;

import java.util.UUID;
import java.util.ArrayList;



public class Personne {
	
	/**
	 * l'identifiant d'une personne
	 * 
	 * @see Personne#getIdpersonne()
	 */
	private static UUID idpersonne;
	
	/**
	 * le nom d'une personne
	 * 
	 * @see Personne#getNom()
	 * @see Personne#getNom()
	 */
	protected String nom;
	
	/**
	 * le prenom d'une personne
	 * @see Personne#getPrenom()
	 * @see Personne#setPrenom()
	 */
	protected String prenom;
	
	/**
	 * collection qui contient les differentes personnes
	 * 
	 * @see Personne#AjouterPersonne(UUID, String, String)
	 * @see Personne#SupprimerPersonne(Personne)
	 */
	static ArrayList<Personne>CollectionPersonne;
	
	/**
	 * constructeur 
	 * 
	 * @param id
	 * 			l'identifiant d'une personne
	 * @param nom
	 * 			le nom d'une personne
	 * @param prenom
	 * 			le prenom d'une personne
	 * 
	 * @see Personne#nom
	 * @see Personne#prenom
	 * @see Personne#idpersonne
	 * @see Personne#CollectionPersonne
	 * 
	 */
	public Personne(UUID id, String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		idpersonne = UUID.randomUUID();
		CollectionPersonne = new ArrayList<Personne>();
	}

	/**
	 * retourne l'identifiant d'une personne
	 * 
	 * @return idpersonne
	 */
	public static UUID getIdpersonne() {
		return idpersonne;
	}

	/**
	 * retourne le nom d'une personne
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * definit le nom d'une personne
	 * 
	 * @param nom
	 * 			le nom d'une personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * retourne le prenom d'une personne
	 * @return prenom
	 *			le prenom d'une personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * definit le prenom d'une personne
	 * @param prenom
	 * 			le prenom d'une personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * supprime une personne de la collection de personnes
	 * @param p
	 * 			la personne qui achete le produit et passe une commande
	 * 
	 *  @see Personne#CollectionPersonne
	 */
	public static void SupprimerPersonne(Personne p) {
		CollectionPersonne.remove(p);
	}

	/**
	 * ajoute une personne dans la collection de personnes
	 * 
	 * @param id
	 * 			l'identifiant d'une personne
	 * @param nom
	 * 			le nom d'une personne
	 * @param prenom
	 * 			le prenom d'une personne
	 * 
	 * @see Personne#CollectionPersonne
	 * @see Personne
	 */
	public static void AjouterPersonne(UUID id, String nom, String prenom) {
		Personne p=new Personne(id, nom, prenom);
		CollectionPersonne.add(p);
	}


	
	
		
	
	
	
	
	

	

	
	
	
	

}
