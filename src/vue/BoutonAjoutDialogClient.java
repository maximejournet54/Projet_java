package vue;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
//import javax.swing.JTextArea; peut-etre a remplacer au lieu de JTextField pour recuperer ce qui est ecrit dans la zone de texte




public class BoutonAjoutDialogClient extends Fenetre{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2388348572849994885L;
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	
		private BoutonAjoutDialogClient(Fenetre f) {
			f.getBoutonAjout().addActionListener(this);
			}
		
		 	public static void fenetreBoutonAjout() {    
		      JFrame frame = new JFrame("Ajouter un client");
		      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      creerUI(frame);
		      
		      frame.setSize(300, 250); 
		      frame.setLayout(new GridLayout(4,1)); // 4 lignes et 1 colonne
		      frame.setLocationRelativeTo(null);  
		      frame.setVisible(true);
		 	  }
	
		 
		 private static void creerUI(final JFrame frame){ 
			 //pannel avec l'identifiant du client
			  JPanel p1 = new JPanel();
		      JLabel l1=new JLabel("ID du client");
		      JTextField t1=new JTextField(10);
		      p1.add(l1);
		      p1.add(t1);
		      frame.add(p1);
		      
			 //panel avec le nom du client
		      JPanel p2 = new JPanel();
		      JLabel l2=new JLabel("nom du client");
		      JTextField t2=new JTextField(15);
		      p2.add(l2);
		      p2.add(t2);
		      frame.add(p2);
		      
		      //panel avec le prenom du client
		      JPanel p3 = new JPanel();
		      JLabel l3=new JLabel("prenom du client");
		      JTextField t3=new JTextField(15);
		      p3.add(l3);
		      p3.add(t3);
		      frame.add(p3);
		      
		      JPanel p4=new JPanel();
		      JButton b=new JButton("ajouter");
		      p4.add(b);
		      frame.add(p4);
		      	      
		 	  }     
		
		}
		

