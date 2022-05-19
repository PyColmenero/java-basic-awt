package es.studium;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos_01 implements ActionListener {

	public Frame main_menu = new Frame("Quoridor");
	
	

	private final int WIDTH = 400;
	private final int HEIGHT = 300;
	
	private Label lblTitle = new Label( "Quoridor", Label.CENTER );
	
	private Button btnPlay = new Button("Play!");
	private Panel pnlPlay = new Panel();
	
	private Button btnHelp = new Button("Help");
	private Button btnTop = new Button("Top 10");
	private Panel pnlButtons = new Panel();
	
	public Eventos_01() {
		
		// Main
		main_menu.setBounds( 50,50, WIDTH,HEIGHT );
		main_menu.setBackground(Color.DARK_GRAY);
		
		main_menu.setLayout( new GridLayout(4,1));
		
		// Layout
		// title
		lblTitle.setFont( new Font("Monospaced", Font.BOLD, 30));
		lblTitle.setForeground(Color.white);
		main_menu.add(lblTitle);
		
		//empty
		main_menu.add( new Panel());
		
		// button PLAY
		btnPlay.addActionListener(this);
		btnPlay.setPreferredSize( new Dimension( (int)Math.round(WIDTH*0.75), (int)Math.round(HEIGHT*0.15) ) );
		pnlPlay.add( btnPlay );
		main_menu.add( pnlPlay );
		
		// buttons HELP && Top 10 
		btnHelp.setPreferredSize( new Dimension( (int)Math.round(WIDTH*(0.75/2))-5, (int)Math.round(HEIGHT*0.15) ) );
		pnlButtons.add( btnHelp );
		
		btnTop.setPreferredSize( new Dimension( (int)Math.round(WIDTH*(0.75/2))-5, (int)Math.round(HEIGHT*0.15) ) );
		pnlButtons.add( btnTop );
		
		main_menu.add(pnlButtons);
		
		
		// End
		main_menu.setVisible(true);
		main_menu.setResizable(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Eventos_01();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(btnPlay)) {
			new Inputs_Menu(100);
		}
		
	}

}
