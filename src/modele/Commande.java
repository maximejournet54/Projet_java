	package modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("serial")
public final class Commande implements Serializable {
	transient private Personne client;
    private Date DateDebut;
    private Date DateFin;
    transient private List<Produit> produits;
    private List<UUID> IDproduits;
    private UUID IDclient;
    private int reduction;
    private UUID id;
	public Commande(Personne client, Date dateDebut, Date dateFin, int reduction) {
		this.client = client;
		DateDebut = dateDebut;
		DateFin = dateFin;
		this.reduction = reduction;
		 produits = new ArrayList<Produit>();
	        IDproduits = new ArrayList<UUID>();
	        IDclient = client.getId();
	        id = UUID.randomUUID();
	}
	
	public Date getDateDebut() {
		return DateDebut;
	}
	
	public Date getDateFin() {
		return DateFin;
	}
	
	public void liendonnees(List<Personne> personnes, List<Produit> produits) {
        this.produits = new ArrayList<Produit>();
        for (UUID id : IDproduits) {
            for (Produit produit : produits) {
                if (id.equals(produit.getId())) {
                    this.produits.add(produit);
                    break;
                }
            }
        }
        for (Personne personne : personnes) {
            if (personne.getId().equals(IDclient)) {
                this.client = personne;
                break;
            }
        }
        }
    
	 public UUID getID() {
	        return id;
	 }
	 
	 public int getReduction() {
	        return reduction;
	 }
	 
	 public Personne getClient() {
	        return client;
	    }
	 
	 public void ajoutproduit(Produit produit) {
	        if (!produits.contains(produit)) {
	            produits.add(produit);
	            IDproduits.add(produit.getId());
	        }
	    }
    
	 public List<Produit> getProduits() {
	        return new ArrayList<Produit>(produits);
	    }
	 
	 public void retirerproduit(Produit produit) {
	        produits.remove(produit);
	        IDproduits.remove(produit.getId());
	    }
	 
	 
	 
	 
    
    

}
