package modele;

import java.util.UUID;

@SuppressWarnings("serial")
public class DVD implements Numerique {
	
	protected double prix;
	protected String titre;
	protected String directeur;
	private UUID id;
	
	public DVD(double prix, String titre, String directeur) {
		this.prix = prix;
		this.titre = titre;
		this.directeur = directeur;
		id=UUID.randomUUID();
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
	
	public String getDirecteur() {
		return directeur;
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
