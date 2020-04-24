package modèle;

import java.io.Serializable;
import java.util.UUID;

//Eclipse émet une alerte si on ne donne pas de valeur explicite à id
@SuppressWarnings("serial")
public class Personne implements Serializable {
	private UUID id;
	protected String nom;
	protected String prénom;
	
	public Personne(String nom, String prénom) {
		id = UUID.randomUUID();
		this.nom = nom;
		this.prénom = prénom;
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

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prénom=" + prénom + "]";
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
