package vue;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Fenetre extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7394006427481956893L;
	private JComboBox<Object> choixFenBox;
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
	private JTable tableCl, tableCo, tablePr;
	private JLabel lclient,lproduit,lcommande;

	public Fenetre(){
	
		this.setTitle("projet"); // titre 
		this.setSize(1400, 570); // taille fenetre
		this.setLocationRelativeTo(null); // position au centre
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fermer clic croix rouge
		this.setResizable(false);
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
	
    
			    
			 // panneau qui contient 2 boutons
				JPanel panneau1=new JPanel();

				//ajouter choix de la fenêtre à ouvrir
				Object[] choix = new Object[]{"Client","Commande","Produit"};
				choixFenBox = new JComboBox<>(choix);
				
				
				// ajouter image au bouton +
				boutonAjout=new JButton(new ImageIcon("images/ajout.png"));
				
				
				// ajouter image au bouton -
				boutonSuppr=new JButton(new ImageIcon("images/suppr.png"));
				
				JPanel pnlTab = new JPanel();
				pnlTab.setLayout(new GridLayout(1, 1));

				// Talbeau Client
				JPanel pnlClient = new JPanel();
				String[] titreCl = new String[] { "Identifiant", "Nom", "Prenom" };
				Object[][] tabCl = { { "1", "CALVET", "Yann" } };
				DefaultTableModel tableauCl = new DefaultTableModel(tabCl, titreCl);
				tableCl = new JTable(tableauCl);
				lclient = new JLabel("Tableau des clients");
				pnlClient.add(lclient);
				pnlClient.add(new JScrollPane(tableCl));
				pnlTab.add(pnlClient);

				// Tableau Commande
				JPanel pnlCommande = new JPanel();
				String[] titreCo = new String[] { "Date Début", "Date Fin", "Montant" };
				Object[][] tabCo = { { "01/01/2020", "01/02/2020", "10" } };
				DefaultTableModel tableauCo = new DefaultTableModel(tabCo, titreCo);
				tableCo = new JTable(tableauCo);
				lcommande = new JLabel("Tableau des commandes");
				pnlCommande.add(lcommande);
				pnlCommande.add(new JScrollPane(tableCo));
				pnlTab.add(pnlCommande);

				// Tableau Produit
				JPanel pnlProduit = new JPanel();
				String[] titrePr = new String[] { "Identifiant", "Titre", "Tarif" };
				Object[][] tabPr = {{"1","Livre","10"}};
				DefaultTableModel tableauPr = new DefaultTableModel(tabPr,titrePr);
				tablePr = new JTable(tableauPr);
				lproduit = new JLabel("Tableau des produits");
				pnlProduit.add(lproduit);
				pnlProduit.add(new JScrollPane(tablePr));
				pnlTab.add(pnlProduit);

				panneau1.add(choixFenBox);
				panneau1.add(boutonAjout);
				panneau1.add(boutonSuppr);
				panneau1.setBackground(Color.DARK_GRAY);

				this.add(pnlTab, BorderLayout.NORTH);
				this.add(panneau1, BorderLayout.SOUTH);
				boutonAjout.addActionListener(this);
				boutonSuppr.addActionListener(this);		
}
	
	

	public JButton getBoutonAjout() {
		return boutonAjout;
	}
	
	public JButton getBoutonSuppr() {
		return boutonSuppr;
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

	
	public void actionPerformed(ActionEvent e) 
	{
		JButton b = (JButton) e.getSource();
		String choix = (String) choixFenBox.getSelectedItem();
		String strInfoCl, strInfoCo, strInfoPr;
		DefaultTableModel tabCl = (DefaultTableModel) tableCl.getModel();
		DefaultTableModel tabCo = (DefaultTableModel) tableCo.getModel();
		DefaultTableModel tabPr = (DefaultTableModel) tablePr.getModel();

		if(b == boutonAjout)
		{
			if(choix == "Client") 
			{
				strInfoCl = JOptionPane.showInputDialog(this,"Saisir les informations du client en les separant par espace\nIdentifiant Nom Prenom (ex : 1 CALVET Yann)","Inscription client", JOptionPane.QUESTION_MESSAGE);
				String[] infoCl = strInfoCl.split(" ");
				tabCl.addRow(new Object[]{infoCl[0], infoCl[1], infoCl[2]});
			}
			else if (choix == "Commande")
			{
				strInfoCo = JOptionPane.showInputDialog(this,"Saisir les informations de la commande en les separant par espace\nDateDébut DateFin Montant (ex : 01/01/2020 01/02/2020 10)","Nouvelle Commande", JOptionPane.QUESTION_MESSAGE);
				String[] infoCo = strInfoCo.split(" ");
				tabCo.addRow(new Object[]{infoCo[0], infoCo[1], infoCo[2]});
			}
			else if (choix == "Produit")
			{
				strInfoPr = JOptionPane.showInputDialog(this,"Saisir les informations du produit en les separant par espace\nIdentifiant Nom Tarif (ex : 1 Livre 10)","Création produit", JOptionPane.QUESTION_MESSAGE);
				String[] infoPr = strInfoPr.split(" ");
				tabPr.addRow(new Object[] { infoPr[0], infoPr[1], infoPr[2] });
			}
		}
		else if(b==boutonSuppr && (tableCl.getSelectedRow() != -1 || tableCo.getSelectedRow() != -1 || tablePr.getSelectedRow() != -1))
		{
			int res = JOptionPane.showOptionDialog(this, "Voulez vous supprimer ce(s) ligne(s) ?","Supprimer ligne(s) ?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Oui", "Non" }, JOptionPane.YES_OPTION);
			if(res == JOptionPane.YES_OPTION)
			{
				if(tableCl.getSelectedRow() != -1)
					tabCl.removeRow(tableCl.getSelectedRow());

				if(tableCo.getSelectedRow() != -1)
					tabCo.removeRow(tableCo.getSelectedRow());

				if(tablePr.getSelectedRow() != -1)
					tabPr.removeRow(tablePr.getSelectedRow());
				
				JOptionPane.showMessageDialog(this, "Ligne(s) supprimee(s)", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(res == JOptionPane.NO_OPTION)
				JOptionPane.showMessageDialog(this, "Opération annulee", "Information",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
