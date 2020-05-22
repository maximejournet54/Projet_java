package modele;

import java.util.Date;
import java.util.UUID;

@SuppressWarnings("serial")
public class CD implements Numerique{
	
	protected double prix;
	protected String titre;
	protected Date annee_sortie;
	private UUID id;
	
	public CD(double prix, String titre, Date annee_sortie) {
		this.prix = prix;
		this.titre = titre;
		this.annee_sortie = annee_sortie;
		id=UUID.randomUUID();
	}

	@Override
	public double getPrix() {
		return prix;
	}

	@Override
	public String getTitre() {
		return titre;
	}

	@Override
	public UUID getId() {
		return id;
	}
	
	public Date getAnnee_sortie() {
		return annee_sortie;
	}

	@Override
	public String toString() {
		return "CD [titre=" + titre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Produit) {
			return id.equals(((Produit)obj).getId());
		}
		
		else 
			return super.equals(obj);
		
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	

}
