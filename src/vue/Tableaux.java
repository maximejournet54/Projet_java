package vue;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tableaux extends Fenetre{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6136054438211995410L;
	
	 static void tableauClient(){
		//tableau avec la liste des clients
	    Object[][] data2 = {
			      // a changer pour ajouter les clients
	    		{"1","Michel","Jean"}
			    };

	    //Les titres des colonnes
	    String  client[] = {"Identifiant", "Nom", "Prenom"};
	    JTable tableau2 = new JTable(data2, client);
	    //Nous ajoutons notre tableau a notre contentPane dans un scroll
	    //Sinon les titres des colonnes ne s'afficheront pas !
	   
	}
	
	 static void tableauCommande() {
		//tableau avec la liste des commandes
	    Object[][] data3 = {
			      // a changer pour ajouter les commandes
	    		{"01/01/2020","03/01/2020","10"}
			    };

	    //Les titres des colonnes
	    String  commande[] = {"Date debut", "Date fin", "Montant"};
	    JTable tableau3 = new JTable(data3, commande);
	    //Nous ajoutons notre tableau a notre contentPane dans un scroll
	    //Sinon les titres des colonnes ne s'afficheront pas !
	    
	}
	
	 static void tableauProduit() {
		//tableau avec la liste des produits
		Object[][] data = {
			      // a changer pour ajouter les produits
				{"1","livre","10"}
			    };

			    //Les titres des colonnes
			    String  produits[] = {"Identifiant", "Titre", "Tarif"};
			    JTable tableau = new JTable(data, produits);
			    //Nous ajoutons notre tableau a notre contentPane dans un scroll
			    //Sinon les titres des colonnes ne s'afficheront pas !
			    
	}
	
	

}
