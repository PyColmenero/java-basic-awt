package es.studium;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Inputs_Menu {

	public Frame play_menu = new Frame("Quoridor");

	private final int WIDTH = 400;
	private final int HEIGHT = 300;
	
	// title
	private Label lblTitle = new Label( "Quoridor", Label.CENTER );
	
	// Inputs
	private Panel pnlInputs = new Panel();
	
	// Play Button
	private Button btnPlay = new Button("Play!");
	private Panel pnlPlay = new Panel();
	
	
	
	public Inputs_Menu(int players_ammount) {
		
		// Main
		play_menu.setBounds( 50,50, WIDTH,HEIGHT );
		play_menu.setBackground(Color.DARK_GRAY);
		
		play_menu.setLayout( new GridLayout(4,1));
		
		// Title
		lblTitle.setFont( new Font("Monospaced", Font.BOLD, 30));
		lblTitle.setForeground(Color.white);
		play_menu.add(lblTitle);
		
		// Empty
		play_menu.add( new Panel());
		
		// Inputs
		for(int x = 0; x < players_ammount; x++) {
			pnlInputs.add( new TextField("Player " + x + "... ") );
		}
		play_menu.add(pnlInputs);
		
		// Play Button
		btnPlay.setPreferredSize( new Dimension( (int)Math.round(WIDTH*0.75), (int)Math.round(HEIGHT*0.15) ) );
		pnlPlay.add( btnPlay );
		play_menu.add( pnlPlay );
		

		// End
		play_menu.setVisible(true);
		play_menu.setResizable(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Eventos_01();
		
	}

}
