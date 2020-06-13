package modele;

public abstract class Document extends Produit {

	/**
	 * constructeur
	 * 
	 * @param titre
	 * 				le titre du document
	 * @param tarifjournalier
	 * 				le tarif journalier du document
	 * 
	 * @see Produit#titre
	 * @see Produit#tarifjournalier
	 * 
	 */
	public Document(String titre, float tarifjournalier) {
		super(titre, tarifjournalier);
	}

}
