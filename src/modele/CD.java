package modele;

import java.util.UUID;

public class CD extends Numerique{
	
	/**
	 * l'annee de sortie du CD
	 * 
	 * @see CD#getAnneesortie()
	 * @see CD#setAnneesortie(int)
	 */
	protected int anneesortie;
	/**
	 * l'identifiant du CD
	 * 
	 * @see CD#getId()
	 */
	private UUID id;
	
	/**
	 * constructeur
	 * 
	 * @param titre
	 * 				le titre du CD
	 * @param anneesortie
	 * 				l'annee de sortie du CD
	 * @param tarifjournalier
	 * 				le tarif journalier du CD
	 * 
	 * @see CD#anneesortie
	 * @see CD#id
	 * @see Produit#titre
	 * @see Produit#tarifjournalier
	 */
	public CD(String titre, int anneesortie, float tarifjournalier) {
		super(titre, tarifjournalier);
		this.anneesortie = anneesortie;
		id=UUID.randomUUID();
	}

	/**
	 * retourne l'identifiant du CD
	 * 
	 * @return l'identifiant du CD
	 */
	public UUID getId() {
		return id;
	}
	
	/**
	 * retourne L'annee de sortie du CD
	 * 
	 * @return L'annee de sortie du CD
	 */
	public int getAnneesortie() {
		return anneesortie;
	}

	/**
	 * definit l'annee de sortie du CD
	 * 
	 * @param anneesortie
	 * 					l'annee de sortie du CD
	 */
	public void setAnneesortie(int anneesortie) {
		this.anneesortie = anneesortie;
	}

}
