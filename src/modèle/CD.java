package mod�le;

import java.util.Date;
import java.util.UUID;

@SuppressWarnings("serial")
public class CD implements Num�rique{
	
	protected double prix;
	protected String titre;
	protected Date ann�e_sortie;
	private UUID id;
	
	public CD(double prix, String titre, Date ann�e_sortie) {
		this.prix = prix;
		this.titre = titre;
		this.ann�e_sortie = ann�e_sortie;
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
	
	public Date getAnn�e_sortie() {
		return ann�e_sortie;
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
