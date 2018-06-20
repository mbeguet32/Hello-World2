import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * PROJET : Swing
 * Fichier : MaFen.java
 */

/**
 * @author 31010-07-02 - M.BEGUET
 * Créer le 11 juin 2018
 */
public class MaFen extends JFrame {
	
	private JLabel monLabel = new JLabel("Hello World !!!");
	private String monTitre = "Premier Titre";
	
	/**
	 * CONSTRUCTEURS
	 * @param monLabel
	 * @throws HeadlessException
	 */
	public MaFen(JLabel monLabel) throws HeadlessException {
		super();
		this.setSize(300, 150);
		this.monLabel = monLabel;
		getContentPane().setLayout (new FlowLayout());
		getContentPane().add(monLabel);
		this.setTitle (this.monTitre) ;
	}
	
	public MaFen() throws HeadlessException {
		super();
		this.setSize(300, 150);
		getContentPane().setLayout (new FlowLayout());
		getContentPane().add(monLabel);
		this.setTitle (this.monTitre) ;
	}

	public JLabel getMonLabel() {
		return monLabel;
	}

	public void setMonLabel(JLabel monLabel) {
		this.monLabel = monLabel;
	}
	

	/**
	 * GETTERS
	 * @return monTitre
	 */
	public String getMonTitre() {
		return monTitre;
	}

	/**
	 * SETTERS
	 * @param monTitre - monTitre to set
	 */
	public void setMonTitre(String monTitre) {
		this.monTitre = monTitre;
		this.setTitle (this.monTitre) ;
	}
	
	// AUTRE METHODES
	
		public void afficher() {
			this.setVisible(true);
		}

}
