import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Event.*;

public class Bouton extends JFrame{
	private JButton monBouton ;
	private JLabel monLabel;
	
	public Bouton () {
		setTitle ("Premier bouton") ;
		setSize (300, 200) ;
		monBouton = new JButton ("ESSAI") ;
		monLabel = new JLabel ("AVANT");
		getContentPane().setLayout (new FlowLayout());
		getContentPane().add(monBouton) ;
		getContentPane().add(monLabel);
	}
	
}
