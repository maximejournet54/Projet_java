	package modele;


import java.util.ArrayList;

public final class Commande  {

	private static int nocommande=0;
	ArrayList<Emprunt>CollectionEmprunt;
	
	public Commande() {
		CollectionEmprunt = new ArrayList<Emprunt>();
		setNocommande(getNocommande() + 1);
	}
	
	public void AjouterEmprunt(Emprunt e) {
        CollectionEmprunt.add(e);
	}

	public void SupprimerEmprunt(Emprunt e){
		CollectionEmprunt.remove(e);
	}
	
	public void AfficherEmprunt() {
		System.out.println("----------------------------------------------------------------------------------");
	for(Emprunt e : CollectionEmprunt) {
		System.out.println(e.toString());
	}
		System.out.println("----------------------------------------------------------------------------------");
	}

	public int getNocommande() {
		return nocommande;
	}

	private static void setNocommande(int newnocommande) {
		nocommande = newnocommande;
	}
    
	 
	 
	 
	 
	 
	 
	 
    
    

}
