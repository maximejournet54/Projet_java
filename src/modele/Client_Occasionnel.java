package modele;

public class Client_Occasionnel extends Personne {
	
	private final double reduction = 0;
	
	public Client_Occasionnel(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public double getReduction() {
		return reduction;
	}
	
}
