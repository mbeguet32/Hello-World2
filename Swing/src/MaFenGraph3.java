import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * PROJET : Swing
 * Fichier : MaFenGraph3.java
 */

/**
 * @author 31010-07-02 - M.BEGUET
 * Créer le 11 juin 2018
 */
@SuppressWarnings("serial")
public class MaFenGraph3 extends JFrame implements ActionListener {
	// Variable pour test debug
	private int var1 = 7;
	
	public MaFenGraph3() {
		this.setTitle("Recherche Hotel");
		//this.setLocation(new Point(250, 250));
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		/*getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	*/
		// Boucle pour creer autant de check box que necessaire
		/** TO DO
		 * RECUPERER LES CATEGORIE. i sera donc <= à la taille de la collection categorie 
		 */
		for (int i = 1; i<= this.var1; i++) {
			/*
		JCheckBox chckbxNewCheckBox = new JCheckBox("Check box n° : "+i);
		getContentPane().add(chckbxNewCheckBox);
		*/
		JCheckBox chckbxNewCheckBox = new JCheckBox("Check box n° : "+i);
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 25, i+10, 0);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 0+i;
		getContentPane().add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		}	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void setMinimumSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}


























	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// METHODES
	
		public void afficher() {
			this.setVisible(true);
		}

}
