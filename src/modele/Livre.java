package modele;

import java.util.UUID;


public abstract class Livre extends Document {
	
	/**
	 * l'identifiant du livre
	 * 
	 * @see Livre#getId()
	 * @see Livre#setId()
	 */
	private UUID id;
	
	/**
	 * le nom de l'auteur du livre
	 * 
	 * @see Livre#getAuteur()
	 * @see Livre#setAuteur()
	 */
	protected String auteur;
	
	/**
	 * constructeur
	 * 
	 * @param titre
	 * 				le titre du livre
	 * @param auteur
	 * 				le nom de l'auteur du livre
	 * @param tarifjournalier
	 * 				le tarif journalier du livre
	 * 
	 * @see Document#auteur
	 * @see Document#tarifjournalier
	 * @see Document#auteur
	 * @see Document#id 
	 */
	public Livre(String titre, String auteur, float tarifjournalier) {
		super(auteur, tarifjournalier);
		this.auteur = auteur;
		id=UUID.randomUUID();
	}

	/**
	 * retourne l'auteur du livre
	 * 
	 * @return l'auteur du livre
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * definit l'auteur du livre
	 * 
	 * @param auteur
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	/**
	 * retourne l'identifiant du livre
	 * 
	 * @return l'identifiant du livre
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * definit l'identifiant du livre
	 * 
	 * @param id
	 */
	public void setId(UUID id) {
		this.id = id;
	}
	
}
