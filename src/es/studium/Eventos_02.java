package es.studium;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Eventos_02 extends Frame implements WindowListener, ActionListener {

	private static final long serialVersionUID = 1L;
	
	// DIALOG
	private Dialog msg;
	
	Label lblTitleDialog = new Label();
	
	// MAIN FRAME
	private Label lblTitle = new Label(" Example", Label.CENTER);
	
	private Panel pnlButtons = new Panel();
	private Button btnAccept = new Button("Accept");
	private Button btnCancel = new Button("Cancel");
	
	public Eventos_02() {
		
		this.setTitle("Yokese");
		
		this.setBounds( 50, 50,  500, 300);
		this.setBackground(Color.DARK_GRAY);
		
		this.setLayout( new GridLayout(3,1) );
		
		// Content
		lblTitle.setFont( new Font("Calibri", 20, 35));
		lblTitle.setForeground( Color.white );
		this.add(lblTitle);
		
		//Empty
		add(new Panel());
		
		btnAccept.addActionListener(this);
		btnCancel.addActionListener(this);
		btnAccept.setPreferredSize( new Dimension(200, 50) );
		btnCancel.setPreferredSize( new Dimension(200, 50) );
		pnlButtons.add(btnAccept);
		pnlButtons.add(btnCancel);
		this.add(pnlButtons);
		
		
		
		// End
		this.addWindowListener(this);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Eventos_02();

	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {

		if(msg.isActive()) {
			msg.setVisible(false);
		} else {
			System.exit(0);
		}
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) { }
	@Override
	public void windowIconified(WindowEvent e) { }
	@Override
	public void windowDeiconified(WindowEvent e) { }
	@Override
	public void windowActivated(WindowEvent e) { }
	@Override
	public void windowDeactivated(WindowEvent e) { }

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(btnCancel)) {
			show_dialog("Cancel");
		}
		if(e.getSource().equals(btnAccept)) {
			show_dialog("Accept");
		}
		
	}

	private void show_dialog( String txt ) {
		System.out.println( txt );
		msg = new Dialog(this, "Mensaje", true);

		
		
		// First
		msg.setBounds( 1000, 500,  300, 200);
		
		// Content
		lblTitleDialog.setText(txt);
		lblTitleDialog.setAlignment( Label.CENTER );
		lblTitleDialog.setFont( new Font("Calibri", 20, 35));
		msg.add(lblTitleDialog);
		
		
		
		
		// End
		msg.addWindowListener(this);
		msg.setVisible(true);
		
	}
}
