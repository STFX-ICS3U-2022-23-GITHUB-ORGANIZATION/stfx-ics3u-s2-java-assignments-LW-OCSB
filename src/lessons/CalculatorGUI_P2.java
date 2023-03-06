package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI_P2 {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI_P2 window = new CalculatorGUI_P2();
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
	public CalculatorGUI_P2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(175, 11, 98, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// button1 code goes here
				
				int num1 = 0;
				int num2 = 0;
				int answer = 0;
				
				num1 = Integer.parseInt(textField1.getText());
				num2 = Integer.parseInt(textField2.getText());
				answer = num1 + num2;
				
				textField3.setText(Integer.toString(answer));
				
				
				
			}
		});
		button1.setBounds(35, 43, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Subtract");
		button2.setBounds(35, 77, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Multiply");
		button3.setBounds(35, 111, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Divide");
		button4.setBounds(35, 145, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("Clear");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Clear Button Code
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			}
		});
		button5.setBounds(35, 179, 89, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("Exit");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				// Exit code
				
				System.exit(0);
				
			}
		});
		button6.setBounds(35, 213, 89, 23);
		frame.getContentPane().add(button6);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(186, 81, 87, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(186, 126, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setBounds(186, 169, 75, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setBounds(292, 78, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(292, 123, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(292, 166, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
	}
}
