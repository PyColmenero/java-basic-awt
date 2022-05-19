package es.studium;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Players_Ammount_Menu {


	public Frame player_ammount_menu = new Frame("Player Ammount Menu");

	private final int WIDTH = 400;
	private final int HEIGHT = 300;
	
	// title
	private Label lblTitle = new Label( "Quoridor", Label.CENTER );
	
	// players ammount
	private Button btnPlay2 = new Button("2 Players");
	private Button btnPlay4 = new Button("4 Players");
	private Panel pnlPlayersAmmount = new Panel();
	
	// Back Button
	private Button btnBack = new Button("Back");
	private Panel pnlBack = new Panel();
	
	
	
	public Players_Ammount_Menu() {
		
		// Main
		player_ammount_menu.setBounds( 50,50, WIDTH,HEIGHT );
		player_ammount_menu.setBackground(Color.DARK_GRAY);
		
		player_ammount_menu.setLayout( new GridLayout(4,1));
		
		// Title
		lblTitle.setFont( new Font("Monospaced", Font.BOLD, 30));
		lblTitle.setForeground(Color.white);
		player_ammount_menu.add(lblTitle);
		
		// Empty
		player_ammount_menu.add( new Panel());
		
		// Ammount
		btnPlay2.setPreferredSize( new Dimension( (int)Math.round(WIDTH*(0.75/2))-5, (int)Math.round(HEIGHT*0.15) ) );
		pnlPlayersAmmount.add( btnPlay2 );
		
		btnPlay4.setPreferredSize( new Dimension( (int)Math.round(WIDTH*(0.75/2))-5, (int)Math.round(HEIGHT*0.15) ) );
		pnlPlayersAmmount.add( btnPlay4 );
		player_ammount_menu.add(pnlPlayersAmmount);
		
		// Play Button
		btnBack.setPreferredSize( new Dimension( (int)Math.round(WIDTH*0.75), (int)Math.round(HEIGHT*0.15) ) );
		pnlBack.add( btnBack );
		player_ammount_menu.add( pnlBack );
		

		// End
		player_ammount_menu.setVisible(true);
		player_ammount_menu.setResizable(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Players_Ammount_Menu();
		
	}

}