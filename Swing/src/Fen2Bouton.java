import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event.*;

class Fen2Bouton extends JFrame implements ActionListener {
// Attention : ne pas oublier implements
	private JButton monBouton ;
	private JLabel monLabel;
	
	public Fen2Bouton () {
		setTitle ("Premier bouton") ;
		setSize (300, 200) ;
		monBouton = new JButton ("ESSAI") ;
		monLabel = new JLabel ("AVANT");
		getContentPane().setLayout (new FlowLayout());
		getContentPane().add(monBouton) ;
		getContentPane().add(monLabel);
		monBouton.addActionListener(this);
	}
	@Override
	public void actionPerformed (ActionEvent ev){
		monLabel.setText("APRES");
		monLabel.setFont(new Font("Serif", Font.BOLD, 30));
	}
	
}
