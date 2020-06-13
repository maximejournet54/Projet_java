package modele;


public class Manuel_scolaire extends Livre {

	/**
	 * constructeur
	 * 
	 * @param auteur
	 * 				l'auteur du manuel scolaire
	 * @param titre
	 * 				le titre du manuel scolaire
	 * @param tarifjournalier
	 * 				le tarif journalier du manuel scolaire
	 * 
	 * @see Livre#auteur
	 * @see Livre#titre
	 * @see Livre#tarifjournalier
	 */
	public Manuel_scolaire(String auteur, String titre, float tarifjournalier) {
        super( auteur, titre, tarifjournalier);
	}
	

}
