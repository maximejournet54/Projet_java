package vue;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Fenetre extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 7394006427481956893L;
	private JComboBox<Object> choixFenBox;
	private JButton boutonAjout;
	private JButton boutonSuppr;
	private JTable tableCl, tableCo, tablePr;
	private JLabel lclient,lproduit,lcommande;

	// constructeur 
	public Fenetre(){
	
		this.setTitle("Gestion de la vidéothèque"); // titre 
		this.setSize(1400, 570); // taille fenetre
		this.setLocationRelativeTo(null); // position au centre
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fermer au clic sur la croix rouge
		this.setResizable(false); // on ne peut pas redimensionner la fenêtre
		initListeners(); // initialisation des listeners
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
    
			    
				// panel qui contient 2 boutons et 1 combobox
				JPanel panneau1=new JPanel();

				//ajouter choix de la fenetre a  ouvrir
				Object[] choix = new Object[]{"Client","Commande","Produit"};
				choixFenBox = new JComboBox<>(choix);
				
				
				// ajouter image au bouton d'ajout
				boutonAjout=new JButton(new ImageIcon("images/ajout.png"));
				// ajouter image au bouton de suppression
				boutonSuppr=new JButton(new ImageIcon("images/suppr.png"));
				
				// panel qui contient les tableaux
				JPanel pnlTab = new JPanel();
				pnlTab.setLayout(new GridLayout(1, 1)); // definir le layout

				// Tableau Client
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
				String[] titreCo = new String[] { "Date DÃ©but", "Date Fin", "Montant" };
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
				
				// ajouter les composants au panel 1
				panneau1.add(choixFenBox);
				panneau1.add(boutonAjout);
				panneau1.add(boutonSuppr);
				panneau1.setBackground(Color.DARK_GRAY);
				
				// ajouter les 2 panels a la fenetre
				this.add(pnlTab, BorderLayout.NORTH);
				this.add(panneau1, BorderLayout.SOUTH);
				// ajouter les listeners aux 2 boutons
				boutonAjout.addActionListener(this);
				boutonSuppr.addActionListener(this);		
}
	
	// methodes 

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
    
    //boite de dialogue quand l'utilisateur quitte l application 
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

	// gerer les interactions avec les elements de la fenetre
	public void actionPerformed(ActionEvent e) 
	{
		JButton b = (JButton) e.getSource();
		String choix = (String) choixFenBox.getSelectedItem();
		String strInfoCl, strInfoCo, strInfoPr;
		DefaultTableModel tabCl = (DefaultTableModel) tableCl.getModel();
		DefaultTableModel tabCo = (DefaultTableModel) tableCo.getModel();
		DefaultTableModel tabPr = (DefaultTableModel) tablePr.getModel();

		//bouton d'ajout
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
				strInfoCo = JOptionPane.showInputDialog(this,"Saisir les informations de la commande en les separant par espace\nDateDÃ©but DateFin Montant (ex : 01/01/2020 01/02/2020 10)","Nouvelle Commande", JOptionPane.QUESTION_MESSAGE);
				String[] infoCo = strInfoCo.split(" ");
				tabCo.addRow(new Object[]{infoCo[0], infoCo[1], infoCo[2]});
			}
			else if (choix == "Produit")
			{
				strInfoPr = JOptionPane.showInputDialog(this,"Saisir les informations du produit en les separant par espace\nIdentifiant Nom Tarif (ex : 1 Livre 10)","CrÃ©ation produit", JOptionPane.QUESTION_MESSAGE);
				String[] infoPr = strInfoPr.split(" ");
				tabPr.addRow(new Object[] { infoPr[0], infoPr[1], infoPr[2] });
			}
		}
		
		// bouton de suppression
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
				JOptionPane.showMessageDialog(this, "Operation annulee", "Information",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
