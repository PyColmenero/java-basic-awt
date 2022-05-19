package es.studium;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example_AWT extends Frame {

	private static final long serialVersionUID = 1L;

	
	Label lblCant = new Label( "Cantidad:" );
	TextField txtCant = new TextField( 20 );
	
	Label lblPorc = new Label( "Porcentaje:" );
	TextField txtPorc = new TextField( 20 );
	
	Button btnResul = new Button( "Calcular" );
	Label lblResul = new Label( "Resultado: " );
	
	public Example_AWT() {
		
		// Main
		setBounds( 50,50, 350,300 );
		setBackground(Color.DARK_GRAY);
		
		setLayout( new FlowLayout());
		
		// Layout
		lblCant.setForeground(Color.white);
		lblCant.setFont( new Font("Monospaced", Font.BOLD, 18));
		add(lblCant);
		add(txtCant);
		
		lblPorc.setForeground(Color.white);
		lblPorc.setFont( new Font("Monospaced", Font.BOLD, 18));
		add(lblPorc);
		add(txtPorc);
		
		
		btnResul.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	double cant = Double.parseDouble( txtCant.getText() );
	        	double porc = Double.parseDouble(txtPorc.getText());
	        	double resul = (cant / 100) * porc;
	        	lblResul.setText( "Resultado: " + String.valueOf( resul ) );
	        }
	    });
		add(btnResul);
		lblResul.setForeground(Color.white);
		lblResul.setFont( new Font("Monospaced", Font.BOLD, 18));
		add(lblResul);
		
		
		// End
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Example_AWT();
		
	}
	
	

}
