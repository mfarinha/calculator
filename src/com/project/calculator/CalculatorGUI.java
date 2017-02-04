package com.project.calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField display;
	
	private String disCont="";
	private JTextField textField;

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
		display.setBounds(50, 94, 212, 30);
		frame.getContentPane().add(display);
		display.setColumns(10);
		display.setFont(new Font("Arial", Font.BOLD, 14));
		display.setForeground(Color.BLACK);
		
		JLabel operatorDisplay = new JLabel("");
		operatorDisplay.setBounds(272, 102, 46, 14);
		operatorDisplay.setFont(new Font("Arial", Font.BOLD, 20));
		operatorDisplay.setForeground(Color.BLACK);
		frame.getContentPane().add(operatorDisplay);
		
		// FIRST SET
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "7";
				display.setText(disCont);
			}
		});
		seven.setBounds(50, 144, 42, 25);
		frame.getContentPane().add(seven);
		
		JButton eigth = new JButton("8");
		eigth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "8";
				display.setText(disCont);
			}
		});
		eigth.setBounds(100, 144, 42, 25);
		frame.getContentPane().add(eigth);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "9";
				display.setText(disCont);
			}
		});
		nine.setBounds(150, 144, 42, 25);
		frame.getContentPane().add(nine);
		
		// SECOND SET
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "4";
				display.setText(disCont);
			}
		});
		four.setBounds(50, 179, 42, 25);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "5";
				display.setText(disCont);
			}
		});
		five.setBounds(100, 179, 42, 25);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "6";
				display.setText(disCont);
			}
		});
		six.setBounds(150, 179, 42, 25); // x, y, width, height
		frame.getContentPane().add(six);
		
		// THIRD SET
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "1";
				display.setText(disCont);
			}
		});
		one.setBounds(50, 214, 42, 25);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "2";
				display.setText(disCont);
			}
		});
		two.setBounds(100, 214, 42, 25);
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "3";
				display.setText(disCont);
			}
		});
		three.setBounds(150, 214, 42, 25);
		frame.getContentPane().add(three);
		
		// FOURTH SET
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disCont += "0";
				display.setText(disCont);
			}
		});
		zero.setBounds(50, 249, 93, 25);
		frame.getContentPane().add(zero);
		
		JButton dot = new JButton(".");
		dot.setBounds(150, 249, 42, 25);
		frame.getContentPane().add(dot);
		
		JButton equal = new JButton("=");
		equal.setText("=");
		equal.setBounds(50, 279, 93, 25);
		frame.getContentPane().add(equal);
		
		// FIFTH SET
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				operatorDisplay.setText("+");
			}
		});
		plus.setBounds(200, 249, 60, 25);
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.setBounds(200, 214, 60, 25);
		frame.getContentPane().add(minus);
		
		JButton multiply = new JButton("*");
		multiply.setBounds(200, 179, 60, 25);
		frame.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.setBounds(200, 144, 60, 25);
		frame.getContentPane().add(divide);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Arial", Font.BOLD, 14));
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(50, 65, 212, 30);
		frame.getContentPane().add(textField);
		
		frame.setSize(400, 400); //width, height
	}
}
