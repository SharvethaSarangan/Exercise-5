import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class AddMinus {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
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
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 517, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(56, 120, 124, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel MinusLabel = new JLabel("STATE A NUMBER");
		MinusLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		MinusLabel.setBounds(317, 58, 132, 69);
		frame.getContentPane().add(MinusLabel);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setBounds(317, 120, 132, 43);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel MinusLabel_1 = new JLabel("STATE A NUMBER");
		MinusLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		MinusLabel_1.setBounds(48, 58, 132, 69);
		frame.getContentPane().add(MinusLabel_1);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int a = Integer.parseInt(textField.getText());
					int b = Integer.parseInt(textField_1.getText());
					
					int answer = a+b;
					
					textField_2.setText(Integer.toString(answer));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"INVALID NUMBER");;
				}
			}
		});
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddButton.setBackground(Color.CYAN);
		AddButton.setBounds(150, 199, 112, 50);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int a = Integer.parseInt(textField.getText());
					int b = Integer.parseInt(textField_1.getText());
					
					int answer = a-b;
					
					textField_2.setText(Integer.toString(answer));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "INVALID NUMBER");
				}
			}
		});
		MinusButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		MinusButton.setBackground(Color.CYAN);
		MinusButton.setBounds(272, 199, 103, 50);
		frame.getContentPane().add(MinusButton);
		
		JLabel AnsLabel = new JLabel("ANSWER :");
		AnsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		AnsLabel.setBounds(154, 288, 79, 23);
		frame.getContentPane().add(AnsLabel);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_2.setBounds(239, 284, 103, 35);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
