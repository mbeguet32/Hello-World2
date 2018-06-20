/**
 * PROJET : Swing
 * Fichier : MaFenGraph.java
 */


import javax.swing.JFrame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 * @author 31010-07-02 - M.BEGUET
 * Créer le 11 juin 2018
 */
public class MaFenGraph extends JFrame implements ActionListener{
	private JTextField txtHotel;
	private JButton btnRechercher;
	private JButton button;
	public MaFenGraph() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(750, 500));
		
		setMinimumSize(new Dimension(50, 50));
		setLocation(new Point(250, 250));
		setTitle("Ma Premiere Fenetre Builder");
		setSize(1000, 500);
		
		JLabel lblHelloWorld = new JLabel("Bienvenue !!!");
		lblHelloWorld.setFont(new Font("Verdana", Font.BOLD, 30));
		lblHelloWorld.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		lblHelloWorld.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblHelloWorld.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		
		txtHotel = new JTextField();
		txtHotel.setText("Hotel ?");
		txtHotel.setColumns(10);
		
		btnRechercher = new JButton("Rechercher");
		
		button = new JButton("?");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblHelloWorld, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(txtHotel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button)
								.addComponent(btnRechercher))))
					.addContainerGap(582, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHelloWorld, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(105)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtHotel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRechercher))
					.addGap(18)
					.addComponent(button)
					.addContainerGap(192, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		btnRechercher.addActionListener(this);
		button.addActionListener(this);
	}
	
	
	// METHODES
	
	public void afficher() {
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.btnRechercher) {
			this.txtHotel.setText("Vous avez cliqué !!!");
			this.txtHotel.setColumns(20);
			}
		else {
			MaFenGraph2 maFen = new MaFenGraph2();
			maFen.afficher();
		}
		
	}
}
