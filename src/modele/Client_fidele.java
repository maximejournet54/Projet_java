package modele;


public class Client_fidele extends Personne {
	
	private final double reduction = 0.1;
	

	public Client_fidele(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public double getReduction() {
		return reduction;
	}

}
