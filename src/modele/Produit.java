package modele;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Produit {

	/**
	 * le titre du produit
	 * 
	 * @see Produit#getTitre()
	 * @see Produit#setTitre()
	 * 
	 */
	 protected String titre;
	 
	 /**
	  * le tarif journalier du produit
	  * 
	  * @see Produit#getTarifjournalier()
	  * @see Produit#setTarifjournalier()
	  */
	 protected float tarifjournalier;
	 
	 /**
	  * l'identifiant du produit
	  * 
	  * @see Produit#getIdproduit()
	  * @see Produit#setId()
	  */
	 private UUID idproduit;
	 
	 /**
	  * la collection qui contient les produits
	  * 
	  * @see Produit#AjouterProduit(int, Object)
	  * @see Produit#SupprimerProduit(Produit)
	  */
	 static ArrayList<Produit> CollectionProduit;
	 
	 /**
	  * constructeur 
	  * 
	  * @param titre
	  * 			le titre du produit
	  * @param tarifjournalier
	  * 			le tarif journalier du produit
	  * 
	  * @see Produit#titre
	  * @see Produit#tarifjournalier
	  * @see Produit#idproduit
	  * @see Produit#CollectionProduit
	  */
	 public Produit(String titre, float tarifjournalier) {
		 this.titre=titre;
		 this.tarifjournalier=tarifjournalier;
		 idproduit=UUID.randomUUID();
		 CollectionProduit = new ArrayList<Produit>();
	 }

	 /**
	  * retourne le titre du produit
	  * 
	  * @return le titre du produit
	  */
	public String getTitre() {
		return titre;
	}

	/**
	 * definit le titre du produit
	 * 
	 * @param titre
	 * 				le titre du produit
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * retourne le tarif journalier du produit
	 * 
	 * @return le tarif journalier du produit
	 */
	public float getTarifjournalier() {
		return tarifjournalier;
	}

	/**
	 * definit le tarif journalier du produit
	 * 
	 * @param tarifjournalier
	 * 				le tarif journalier du produit
	 */
	public void setTarifjournalier(float tarifjournalier) {
		this.tarifjournalier = tarifjournalier;
	}
	
	/**
	 * retourne l'identifiant du produit
	 * 
	 * @return l'identifiant du produit
	 */
	public UUID getIdproduit() {
		return idproduit;
	}

	/**
	 * definit l'identifiant du produit
	 * 
	 * @param idproduit
	 * 				l'identifiant du produit
	 */
	public void setId(UUID idproduit) {
		this.idproduit = idproduit;
	}
	 
	/**
	 * supprime un produit de la collection de produits
	 * 
	 * @param p
	 * 				un produit de la collection de produits
	 * 
	 * @see Produit#CollectionProduit
	 */
	public static void SupprimerProduit(Produit p) {
		CollectionProduit.remove(p);
	}

	/**
	 * supprime un produit de la collection de produits
	 * 
	 * @param id
	 * 				l'identifiant d'un produit
	 * @param obj
	 * 				les autres caracteristiques d'un produit
	 * 
	 * @see Produit#CollectionProduit
	 */
	public static void AjouterProduit(int id, Object obj) {
		CollectionProduit.add(id, (Produit) obj);
	}
	
}
