package modele;

import java.io.Serializable;
import java.util.UUID;

//Eclipse emet une alerte si on ne donne pas de valeur explicite a ID
@SuppressWarnings("serial")
public class Personne implements Serializable {
	private UUID id;
	protected String nom;
	protected String prenom;
	
	public Personne(String nom, String prenom) {
		id = UUID.randomUUID();
		this.nom = nom;
		this.prenom = prenom;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Personne) {
			return id.equals(((Personne)obj).id);
		}
		
		else 
			return super.equals(obj);
		
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
		
	
	
	
	
	

	

	
	
	
	

}
