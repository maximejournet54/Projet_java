package modele;

import java.util.UUID;

@SuppressWarnings("serial")
public class Dictionnaire implements Document {
	
	protected String langue;
	protected double prix;
	private UUID id;
	protected String titre;
	protected Dictionnaire(String langue, double prix, String titre) {
		this.langue = langue;
		this.prix = prix;
		this.titre = titre;
		id=UUID.randomUUID();
	}
	
	public String getLangue() {
		return langue;
	}
	
	@Override
	public double getPrix() {
		return prix;
	}
	
	@Override
	public UUID getId() {
		return id;
	}
	
	@Override
	public String getTitre() {
		return titre;
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
