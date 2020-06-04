package modele;

import java.util.Date;

public class Emprunt {
	private Date DateDebut;
	private Date DateFin;
	
	public Emprunt(Date dateDebut, Date dateFin) {
		this.DateDebut = dateDebut;
		this.DateFin = dateFin;
	}
	
	public Date getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	public Date getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
}
