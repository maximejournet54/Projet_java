package mod�le;

import java.io.Serializable;
import java.util.UUID;

//Eclipse �met une alerte si on ne donne pas de valeur explicite � id
@SuppressWarnings("serial")
public class Personne implements Serializable {
	private UUID id;
	protected String nom;
	protected String pr�nom;
	
	public Personne(String nom, String pr�nom) {
		id = UUID.randomUUID();
		this.nom = nom;
		this.pr�nom = pr�nom;
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

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", pr�nom=" + pr�nom + "]";
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
