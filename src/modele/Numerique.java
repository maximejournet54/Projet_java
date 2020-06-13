package modele;

public abstract class Numerique extends Produit {

	/**
	 * constructeur
	 * 
	 * @param titre
	 * 				le titre du manuel scolaire
	 * @param tarifjournalier
	 * 				le tarif journalier du manuel scolaire
	 * 
	 * @see Produit#titre
	 * @see Produit#tarifjournalier
	 */
	public Numerique(String titre, float tarifjournalier) {
		super(titre, tarifjournalier);
	}
	

}
