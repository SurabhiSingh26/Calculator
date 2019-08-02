import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;
import java.awt.Component;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	//changes
	
	private void genText(JTextField comp,String msg) {
		comp.setText("Welcome to Javatpoint."); 
	}
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton add = new JButton("add");
		add.setBounds(50, 50, 100, 100);
		//add.setLocation(50, 50);
		frame.add(add);
		frame.setLayout(null);  
		final JTextField message = new JTextField();
		message.setBounds(300,300, 200,30);  
		 add.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {
				genText(message,"Hola bbay");
			}  
			     });  
		 frame.add(message);
		
	}

}
