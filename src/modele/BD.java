package modele;

import java.util.UUID;

public class BD extends Livre{
	/**
	 * l'identifiant du livre
	 * 
	 * @see BD#getId()
	 */
	private UUID id;

	/**
	 * constructeur
	 * @param auteur
	 * @param titre
	 * @param tarifjournalier
	 * 
	 * @see BD#id
	 * @see Livre#auteur
	 * @see Livre#titre
	 * @see Livre#tarifjournalier
	 */
	public BD( String auteur, String titre, float tarifjournalier) {
        super (auteur, titre, tarifjournalier);
        id=UUID.randomUUID();
    }

	/**
	 * retourne l'identifiant du livre
	 * 
	 * @return id
	 */
	public UUID getId() {
		return id;
	}
}
