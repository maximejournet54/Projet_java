package modele;

import java.util.Date;

public class Emprunt {

	/**
	 * la date de debut de l'emprunt
	 * 
	 * @see Emprunt#getDateDebut()
	 * @see Emprunt#setDateDebut(Date)
	 */
	private Date DateDebut;
	
	/**
	 * la date de fin de l'emprunt
	 * 
	 * @see Emprunt#getDateFin()
	 * @see Emprunt#setDateFin(Date)
	 */
	private Date DateFin;
	
	/**
	 * le montant de l'emprunt
	 * 
	 * @see Emprunt#getMontant()
	 */
	private float montant;
	
	/**
	 * constructeur
	 * 
	 * @param dateDebut
	 * 					la date de debut de l'emprunt
	 * @param dateFin
	 * 					la date de fin de l'emprunt
	 * @param montant
	 * 					le montant de l'emprunt
	 * 
	 * @see Emprunt#DateDebut
	 * @see Emprunt#DateFin
	 * @see Emprunt#montant
	 * 
	 */
	public Emprunt(Date dateDebut, Date dateFin, float montant) {
		this.DateDebut = dateDebut;
		this.DateFin = dateFin;
		this.montant= montant;
	}
	
	/**
	 * retourne la date de debut de l'emprunt
	 * 
	 * @return DateDebut
	 */
	public Date getDateDebut() {
		return DateDebut;
	}
	
	/**
	 * definit la date de debut de l'emprunt
	 * 
	 * @param dateDebut
	 */
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	
	/**
	 * retourne la date de fin de l'emprunt
	 * 
	 * @return DateFin
	 */
	public Date getDateFin() {
		return DateFin;
	}
	
	/**
	 * definit la date de debut de l'emprunt
	 *  
	 * @param dateFin
	 */
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	
	/**
	 * retourne le montant de l'emprunt
	 * 
	 * @return montant
	 */
	public float getMontant() {
		return montant;
	}
}
