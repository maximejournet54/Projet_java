package modele;

import java.util.UUID;
import java.util.ArrayList;



public class Personne {
	
	private static UUID idpersonne;
	protected String nom;
	protected String prenom;
	static ArrayList<Personne>CollectionPersonne;
	
	public Personne(UUID id, String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		idpersonne = UUID.randomUUID();
		CollectionPersonne = new ArrayList<Personne>();
	}

	public static UUID getIdpersonne() {
		return idpersonne;
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
	
	public static void SupprimerPersonne(Personne p) {
		CollectionPersonne.remove(p);
	}

	public static void AjouterPersonne(UUID id, String nom, String prenom) {
		Personne p=new Personne(id, nom, prenom);
		CollectionPersonne.add(p);
	}


	
	
		
	
	
	
	
	

	

	
	
	
	

}
