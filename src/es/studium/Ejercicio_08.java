package es.studium;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio_08 extends Frame implements ActionListener, WindowListener {

	
	private static final long serialVersionUID = 1L;
	
	// INPUTS
	private String writing = "";
	//private String result = "";
	
	private String current_wrote = "";
	private String last_wrote = "";
	
	private boolean dot_wrote = true;

	
	// BUILD BUTTONS
	private int index_y = 0;
	private int index_x = 1;
	String btn_str[] = {"1","2","3","+","4","5","6","-","7","8","9","*",".","0","=","/"};
	
	// COMPONENTS
	private Panel pnl_display = new Panel();
	private Label lbl_wrote = new Label("...");
	private Label lbl_result = new Label("0", Label.RIGHT);


	public Ejercicio_08() {
		
		this.setTitle("Yokese");
		
		this.setBounds( 50, 50,  400, 500);
		this.setBackground(Color.DARK_GRAY);
		
		GridBagConstraints gbc = new GridBagConstraints();
		this.setLayout( new GridBagLayout() );
		
		// Content
		// DISPLAY
		
		pnl_display.setBackground(Color.white);
		pnl_display.setPreferredSize( new Dimension(100,100) );
		pnl_display.setLayout( new GridLayout(2,1) );
		
		lbl_wrote.setFont( new Font("Dialog", Font.PLAIN, 30));
		pnl_display.add(lbl_wrote);
		lbl_result.setFont( new Font("Dialog", Font.PLAIN, 20));
		pnl_display.add(lbl_result);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        this.add( pnl_display , gbc);
  

        // BUTTONS
        
 		for(int x = 0; x < btn_str.length; x++) {
 			Button current_btn = new Button( btn_str[x] );
 			current_btn.setPreferredSize( new Dimension(96, 90) );
 			current_btn.addActionListener(this);
 			
 			if(x % 4 == 0) { index_y++; index_x = 0; }
 			
 			gbc.fill = GridBagConstraints.HORIZONTAL;
 	        gbc.gridx = index_x++;
 	        gbc.gridy = index_y;
 	        gbc.gridwidth = 1;
 	        
 			this.add(current_btn, gbc);
 		}
        
        /*gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
		this.add(new Button("ola"));*/
		
		
		
		// End
 		this.setResizable(false);
		this.addWindowListener(this);
		this.setVisible(true);
				
	}
	
	
	public static void main(String[] args) {
		
		/*String[] fonts = Toolkit.getDefaultToolkit().getFontList();
		for (int i=0;i<fonts.length;i++) {
			System.out.println( fonts[i] );
		}*/
		
		new Ejercicio_08();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(writing.length() > 0) { 
			last_wrote = writing.charAt(writing.length()-1) + "" ; 
		}
		current_wrote = e.getActionCommand();
		
		// CALCULAR RESULTADO
		if(current_wrote == "=") {
			System.out.println("Calculating...");
		} else {
			
			// Si es un número
			//System.out.println("0123456789".indexOf( current_wrote ) );
			if( "0123456789".indexOf( current_wrote ) >= 0) {
				
				writing += e.getActionCommand();
				lbl_wrote.setText( "  " + writing);
			
				
			} else { // si es una operación
				//Si estoy pulsdo otra vez operacion
					
				if("+-*/.".indexOf( last_wrote ) == -1 ) {
					
					if(current_wrote == ".") {
						if(dot_wrote) {
							dot_wrote = false;
							writing += e.getActionCommand();
							lbl_wrote.setText( "  " + writing);
						}						
					} else {
						// añadir al Display
						writing += e.getActionCommand();
						lbl_wrote.setText( "  " + writing);
						dot_wrote = true;
					}
					
				}
			}
			
			
		}
		
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
