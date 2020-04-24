package modèle;

import java.util.Date;
import java.util.UUID;

@SuppressWarnings("serial")
public class CD implements Numérique{
	
	protected double prix;
	protected String titre;
	protected Date année_sortie;
	private UUID id;
	
	public CD(double prix, String titre, Date année_sortie) {
		this.prix = prix;
		this.titre = titre;
		this.année_sortie = année_sortie;
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
	
	public Date getAnnée_sortie() {
		return année_sortie;
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
