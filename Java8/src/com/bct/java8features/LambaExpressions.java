package com.bct.java8features;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambaExpressions {

	public static void main(String[] args) {
		
		Frame frame = new Frame("ActionListener before Java8");
		Button b = new Button("Click here");
		b.setBounds(50,100,59,89);
		//method implementation---Regular method implementation
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello world....");
			}
			
		});
		frame.add(b);
		frame.setSize(200,200);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//Lambda Representation
		b.addActionListener(expression-> System.out.println("My name is Lambda"));
		frame.add(b);
		frame.setSize(200,200);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

}
