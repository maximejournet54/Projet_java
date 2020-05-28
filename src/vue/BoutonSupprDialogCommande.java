package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BoutonSupprDialogCommande extends Fenetre implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2716120749094149242L;
	private Fenetre f;
	
	private BoutonSupprDialogCommande(Fenetre f) {
		this.f = f;
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
	 
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		 

}
