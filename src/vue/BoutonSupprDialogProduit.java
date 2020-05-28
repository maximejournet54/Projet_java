package vue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BoutonSupprDialogProduit extends Fenetre{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9057584153764603647L;
	
	private BoutonSupprDialogProduit(Fenetre f) {
		f.getBoutonSuppr().addActionListener(this);
		}
	
	public static void fenetreBoutonAjout() {    
	      JFrame frame = new JFrame("Supprimer un client");
	      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      creerUI(frame);      
	      frame.setSize(300, 250); 
	      frame.setLocationRelativeTo(null);  
	      frame.setVisible(true);
	 	  }

	 private static void creerUI(final JFrame frame){ 
		 JPanel p=new JPanel();
		 final JOptionPane optionPane=new JOptionPane(
				 "Etes vous certain de supprimer \n cette commande?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION
				 );
		 p.add(optionPane);
		 frame.add(p);
		 
	 }
}
