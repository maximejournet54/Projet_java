package modele;

import java.util.UUID;
import java.util.ArrayList;



public class Personne {
	
	private UUID idpersonne;
	protected String nom;
	protected String prenom;
	ArrayList<Personne>CollectionPersonne;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		idpersonne = UUID.randomUUID();
		CollectionPersonne = new ArrayList<Personne>();
	}

	public UUID getIdpersonne() {
		return idpersonne;
	}

	public void setId(UUID idpersonne) {
		this.idpersonne = idpersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void AjouterPersonne(Personne p) {
		CollectionPersonne.add(p);
	}
	
	public void SupprimerPersonne(Personne p) {
		CollectionPersonne.remove(p);
	}
	
	public void AfficherPersonne() {
		System.out.println("----------------------------------------------------------------------------------");
	for(Personne p : CollectionPersonne) {
		System.out.println(p.toString());
	}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Personne) {
			return idpersonne.equals(((Personne)obj).idpersonne);
		}
		
		else 
			return super.equals(obj);
		
	}
	
	
		
	
	
	
	
	

	

	
	
	
	

}
