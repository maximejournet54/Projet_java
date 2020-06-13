package modele;

import java.util.UUID;


public class Dictionnaire extends Document {
	
	/**
	 * la langue du dictionnaire
	 * 
	 * @see getLangue()
	 * @see setLangue()
	 */
	protected String langue;
	
	/**
	 * l'identifiant du dictionnaire
	 * 
	 * @see getId()
	 */
	private UUID id;
	
	/**
	 * constructeur
	 * 
	 * @param langue
	 * 				la langue du ditionnaire
	 * @param titre
	 * 				le titre du dictionnaire
	 * 
	 * @param tarifjournalier
	 * 				le tarif journalier du dictionnaire
	 * 
	 * @see Dictionnaire#id
	 * @see Dictionnaire#langue
	 */
	public Dictionnaire(String langue,  String titre, float tarifjournalier) {
		super(titre, tarifjournalier);
		this.langue = langue;
		id=UUID.randomUUID();
	}
	
	/**
	 * retourne la langue du dictionnaire
	 * 
	 * @return langue
	 */
	public String getLangue() {
		return langue;
	}
	
	/**
	 * definit la langue du dictionnaire
	 * 
	 * @param langue
	 * 				la langue du dictionnaire
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * retourne l'id du dictionnaire
	 * 
	 * @return id
	 */
	public UUID getId() {
		return id;
	}
	
	
	
	

}
