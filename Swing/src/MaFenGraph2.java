import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Point;

/**
 * PROJET : Swing
 * Fichier : MaFenGraph2.java
 */

/**
 * @author 31010-07-02 - M.BEGUET
 * Créer le 11 juin 2018
 */
public class MaFenGraph2 extends JFrame implements ActionListener{
	public MaFenGraph2() {
		setResizable(false);
		setTitle("Comment Rechercher Hotel");
		setLocation(new Point(250, 250));
		setSize(1000, 500);
		JTextPane txtpnIlSuffitDe = new JTextPane();
		txtpnIlSuffitDe.setFont(new Font("Tahoma", Font.PLAIN, 37));
		txtpnIlSuffitDe.setText("Il suffit de rentrer le nom de l'hotel rechercher !!");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(txtpnIlSuffitDe, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtpnIlSuffitDe, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public void afficher() {
		this.setVisible(true);
	}
	
	
	
	
	
	
	
	// METHODE IMPLEMENTEE
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
