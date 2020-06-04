package modele;

import java.util.UUID;


public class DVD extends Numerique {

	protected String directeur;
	private UUID id;
	
	public DVD(String titre, String directeur, float tarifjournalier) {
		super(titre, tarifjournalier);
		this.directeur = directeur;
		id=UUID.randomUUID();
	}
	
    public UUID getId() {
        return id;
    }
	
	public String getDirecteur() {
		return directeur;
	}

	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
	
	
}
