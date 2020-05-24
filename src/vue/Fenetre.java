package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


@SuppressWarnings("serial")
public class Fenetre extends JFrame implements ActionListener{
	
	private JButton boutonAjout;
	private JButton boutonSuppr;
	private JMenuBar barmenu=new JMenuBar();
	private JMenu produits=new JMenu("Produits");
	private JMenu commande=new JMenu("Commande");
	private JMenu clients=new JMenu("Clients");
	private JMenu documents=new JMenu("Documents");
	private JMenu numerique=new JMenu("Numerique");
	private JMenu livre=new JMenu("Livre");
	private JMenuItem dictionnaire=new JMenuItem("Dictionnaire");
	private JMenuItem cd=new JMenuItem("CD");
	private JMenuItem dvd=new JMenuItem("DVD");
	private JMenuItem fidele=new JMenuItem("Client fidele");
	private JMenuItem occasionnel=new JMenuItem("Client occasionnel");
	private JMenuItem bd=new JMenuItem("BD");
	private JMenuItem scolaire=new JMenuItem("manuel scolaire");
	private JMenuItem roman=new JMenuItem("roman");
	private JMenuItem encours=new JMenuItem("Commande en cours");
	private JMenuItem finie=new JMenuItem("Commande terminee");
	

	public Fenetre(){
	
		
	this.setTitle("projet"); // titre 
	this.setSize(600, 500); // taille fenetre
	this.setLocationRelativeTo(null); // position au centre
	this.setLayout(new BorderLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fermer clic croix rouge
	initListeners();
	 setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
	// barre de menu
	
	
		// ajout des menus dans l'ordre
		barmenu.add(produits);
		barmenu.add(clients);
		barmenu.add(commande);
		
		
		// ajout sous-menus
		//produits
		produits.add(documents);
		produits.add(numerique);
		
		//documents
		documents.add(livre);
		documents.add(dictionnaire);
		
		//livre
		livre.add(roman);
		livre.add(scolaire);
		livre.add(bd);
		
		//numerique
		numerique.add(cd);
		numerique.add(dvd);
		
		//clients
		clients.add(fidele);
		clients.add(occasionnel);
		
		//commande
		commande.add(encours);
		commande.add(finie);
		
		this.setJMenuBar(barmenu);
	
			//tableau avec la liste des produits
				Object[][] data = {
					      // a changer pour ajouter les produits
					      
					    };
		
					    //Les titres des colonnes
					    String  produits[] = {"Identifiant", "Titre", "Tarif"};
					    JTable tableau = new JTable(data, produits);
					    //Nous ajoutons notre tableau a notre contentPane dans un scroll
					    //Sinon les titres des colonnes ne s'afficheront pas !
					    this.getContentPane().add(new JScrollPane(tableau));
				    
			    
			  //tableau avec la liste des clients
			    Object[][] data2 = {
					      // a changer pour ajouter les clients
					      
					    };

			    //Les titres des colonnes
			    String  client[] = {"Identifiant", "Nom", "Prenom"};
			    JTable tableau2 = new JTable(data2, client);
			    //Nous ajoutons notre tableau a notre contentPane dans un scroll
			    //Sinon les titres des colonnes ne s'afficheront pas !
			    this.getContentPane().add(new JScrollPane(tableau2));
			    
				    
			//tableau avec la liste des commandes
					    Object[][] data3 = {
							      // a changer pour ajouter les commandes
							      
							    };
		
					    //Les titres des colonnes
					    String  commande[] = {"Date debut", "Date fin", "Montant"};
					    JTable tableau3 = new JTable(data3, commande);
					    //Nous ajoutons notre tableau a notre contentPane dans un scroll
					    //Sinon les titres des colonnes ne s'afficheront pas !
					    this.getContentPane().add(new JScrollPane(tableau3));
				    
			    
			 // panneau qui contient 2 boutons
				JPanel panneau1=new JPanel(); 
				
				
				// ajouter image au bouton +
				boutonAjout=new JButton(new ImageIcon("images/ajout.png"));
				
				// ajouter image au bouton -
				boutonSuppr=new JButton(new ImageIcon("images/suppr.png"));
				
				
				panneau1.add(boutonAjout);
				panneau1.add(boutonSuppr);
				panneau1.setBackground(Color.DARK_GRAY);
				
				this.add(panneau1, BorderLayout.SOUTH);
				
				
}

	// initialise les Listeners
	private void initListeners() {
		 this.addWindowListener(new ExitListener());
    }
    
     //quand l'utilisateur quitte l application
     
    public void exit() {
        int rep =
                JOptionPane.showConfirmDialog(
                this,
                "Voulez vous vraiment quitter ?",
                "Fermeture de l'application",
                JOptionPane.YES_NO_OPTION);
        System.out.println("rep :"+rep);
        if (rep == 0) {
            System.exit(0);
        }
    }

     //Cette classe quitte l application quand on clique sur la croix
   
    public class ExitListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            exit();
        }
        
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
