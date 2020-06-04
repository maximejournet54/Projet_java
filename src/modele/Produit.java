package modele;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Produit {

	 protected String titre;
	 protected float tarifjournalier;
	 private UUID idproduit;
	 ArrayList<Produit> CollectionProduit;
	 
	 public Produit(String titre, float tarifjournalier) {
		 this.titre=titre;
		 this.tarifjournalier=tarifjournalier;
		 idproduit=UUID.randomUUID();
		 CollectionProduit = new ArrayList<Produit>();
	 }

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public float getTarifjournalier() {
		return tarifjournalier;
	}

	public void setTarifjournalier(float tarifjournalier) {
		this.tarifjournalier = tarifjournalier;
	}
	
	public UUID getIdproduit() {
		return idproduit;
	}

	public void setId(UUID idproduit) {
		this.idproduit = idproduit;
	}
	 
	public void AjouterProduit(Produit p) {
		CollectionProduit.add(p);
	}
	
	public void RetirerProduit(Produit p) {
		CollectionProduit.remove(p);
	}
}
