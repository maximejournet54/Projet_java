package modele;

import java.util.UUID;

public class Client_fidele extends Personne {
	
	private final double reduction = 0.1;
	

	public Client_fidele(UUID idpersonne, String nom, String prenom) {
		super(idpersonne, nom, prenom);
	}
	
	public double getReduction() {
		return reduction;
	}

}
