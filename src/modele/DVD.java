package modele;

import java.util.UUID;


public class DVD extends Numerique {

	/**
	 * le nom du directeur du DVD
	 * 
	 * @see DVD#getDirecteur()
	 * @see DVD#setDirecteur(String)
	 */
	protected String directeur;
	/**
	 * l'identifiant du DVD
	 * 
	 * @see DVD#getId()
	 */
	private UUID id;
	
	/**
	 * constructeur
	 * @param titre
	 * 				le titre du DVD
	 * @param directeur
	 * 				le directeur du DVD
	 * @param tarifjournalier
	 * 				le tarif journalier du DVD
	 * 
	 * @see DVD#directeur
	 * @see DVD#id
	 * @see Numérique#titre
	 * @see Numérique#tarifjournalier
	 * 
	 */
	public DVD(String titre, String directeur, float tarifjournalier) {
		super(titre, tarifjournalier);
		this.directeur = directeur;
		id=UUID.randomUUID();
	}
	
	/**
	 * retourne l'identifiant du DVD
	 * 
	 * @return id
	 */
    public UUID getId() {
        return id;
    }
	
    /**
	 * retourne le nom du directeur du DVD
	 * 
	 * @return le nom du directeur du DVD
	 */
	public String getDirecteur() {
		return directeur;
	}

	/**
	 * definit le nom du directeur du DVD
	 * 
	 * @param directeur
	 * 					le nom du directeur du DVD
	 */
	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
	
}
