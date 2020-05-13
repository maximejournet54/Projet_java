package vue;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener{
	
	private JButton boutonajout;
	private JButton boutonsuppr;
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
	this.setSize(500, 400); // taille fenetre
	this.setLocationRelativeTo(null); // position au centre
	this.setLayout(new BorderLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fermer clic croix rouge
	
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

	boutonajout=new JButton("+");
	boutonsuppr=new JButton("-");
	
	panneau1.add(boutonajout);
	panneau1.add(boutonsuppr);
	panneau1.setBackground(Color.DARK_GRAY);
	
	this.add(panneau1, BorderLayout.SOUTH);
	 
	// panneau qui contient la liste des produits 
	JPanel panneau2=new JPanel(); 
	panneau2.setBackground(Color.DARK_GRAY); // dark theme mais on peut changer la couleur
	
	this.add(panneau2);
	
	

}
}
