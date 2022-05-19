package es.studium;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;


public class Ej3 extends Frame {

	private static final long serialVersionUID = 1L;

	String aficiones[] = {"Nadar", "Correr", "Andar", "Leer", "Ir al cine", "Bailar", "..."};
	
	Button btnResul = new Button( "Calcular" );
	
	public Ej3() {
		
		// Main
		setBounds( 50,50, 350,300 );
		setBackground(Color.DARK_GRAY);
		
		setLayout( new FlowLayout());
		
		// Layout
		for(int x = 0; x < aficiones.length; x++) {
			
			Checkbox currentCB = new Checkbox(aficiones[x]);
			currentCB.setForeground(Color.white);
			this.add( currentCB );
		}
		
		add(btnResul);
		
		
		// End
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ej3();
		
	}
	
	

}