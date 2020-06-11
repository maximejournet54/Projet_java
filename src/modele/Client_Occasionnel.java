package modele;

import java.util.UUID;

public class Client_Occasionnel extends Personne {
	
	private final double reduction = 0;
	
	public Client_Occasionnel(UUID idpersonne, String nom, String prenom) {
		super(idpersonne, nom, prenom);
	}
	
	public double getReduction() {
		return reduction;
	}
	
}
