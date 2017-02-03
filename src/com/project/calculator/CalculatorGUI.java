package com.project.calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField display;
	
	private String disCont="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator v1.0");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// DISPLAY
		
		display = new JTextField();
		display.setEnabled(false);
		display.setBounds(50, 40, 212, 30);
		frame.getContentPane().add(display);
		display.setColumns(10);
		display.setFont(new Font("Arial", Font.BOLD, 14));
		display.setForeground(Color.BLACK);
		
		// FIRST SET
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "7";
				display.setText(disCont);
			}
		});
		seven.setBounds(50, 90, 42, 25);
		frame.getContentPane().add(seven);
		
		JButton eigth = new JButton("8");
		eigth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		eigth.setBounds(100, 90, 42, 25);
		frame.getContentPane().add(eigth);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nine.setBounds(150, 90, 42, 25);
		frame.getContentPane().add(nine);
		
		// SECOND SET
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		four.setBounds(50, 125, 42, 25);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		five.setBounds(100, 125, 42, 25);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		six.setBounds(150, 125, 42, 25); // x, y, width, height
		frame.getContentPane().add(six);
		
		// THIRD SET
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		one.setBounds(50, 160, 42, 25);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		two.setBounds(100, 160, 42, 25);
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		three.setBounds(150, 160, 42, 25);
		frame.getContentPane().add(three);
		
		// FOURTH SET
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		zero.setBounds(50, 195, 93, 25);
		frame.getContentPane().add(zero);
		
		JButton dot = new JButton(".");
		dot.setBounds(150, 195, 42, 25);
		frame.getContentPane().add(dot);
		
		JButton equal = new JButton("=");
		equal.setText("=");
		equal.setBounds(50, 225, 93, 25);
		frame.getContentPane().add(equal);
		
		// FIFTH SET
		
		JButton plus = new JButton("+");
		plus.setBounds(200, 195, 60, 25);
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.setBounds(200, 160, 60, 25);
		frame.getContentPane().add(minus);
		
		JButton multiply = new JButton("*");
		multiply.setBounds(200, 125, 60, 25);
		frame.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.setBounds(200, 90, 60, 25);
		frame.getContentPane().add(divide);
		
		
		frame.setSize(400, 300); //width, height
	}
}
