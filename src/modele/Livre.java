package modele;

import java.util.UUID;

@SuppressWarnings("serial")
public abstract class Livre implements Document {
	
	private UUID id;
	protected double prix;
	protected String titre;
	protected String auteur;
	
	protected Livre(double prix, String titre, String auteur) {
		this.prix = prix;
		this.titre = titre;
		this.auteur = auteur;
		id=UUID.randomUUID();
	}

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + "]";
	}
	
	@Override
    public double getPrix() {
        return prix;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof Produit)
            return id.equals(((Produit)obj).getId());
        else
            return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
	
	
	
	

}
