package caluclatorJAVA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;

public class CalcGUI {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String Operation;
	String answer;
	
	private JButton BTNClear;
	private JButton BTN00;
	private JButton Btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton Btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton BTNDivide;
	private JButton BTNTimes;
	private JButton BtnSub;
	private JButton BTNPlus;
	private JButton Btn0;
	private JButton BTNDecimal;
	private JButton BTNEquals;
	private JButton BTNPercent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
					window.frame.setTitle("Custom Calculator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(40, 11, 250, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton BtnBackspace = new JButton("\uF0E7");
		BtnBackspace.setFont(new Font("WingDings", Font.BOLD, 18));
		BtnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace = str.toString();
					textField.setText(Backspace);
				}
			}
		});
		BtnBackspace.setBounds(40, 87, 55, 55);
		frame.getContentPane().add(BtnBackspace);
		
		BTNClear = new JButton("C");
		BTNClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		BTNClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNClear.setBounds(105, 87, 55, 55);
		frame.getContentPane().add(BTNClear);
		
		BTN00 = new JButton("00");
		BTN00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BTN00.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTN00.setBounds(170, 87, 55, 55);
		frame.getContentPane().add(BTN00);
		
		Btn7 = new JButton("7");
		Btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn7.setBounds(40, 153, 55, 55);
		frame.getContentPane().add(Btn7);
		
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+Btn7.getText();
				textField.setText(number);
				
			}
			
		});
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(105, 153, 55, 55);
		frame.getContentPane().add(btn8);
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
			
		});
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(170, 153, 55, 55);
		frame.getContentPane().add(btn9);
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
				
			}
			
		});
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(40, 219, 55, 55);
		frame.getContentPane().add(btn4);
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
				
			}
			
		});
		
		JButton Btn5 = new JButton("5");
		Btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn5.setBounds(105, 219, 55, 55);
		frame.getContentPane().add(Btn5);
		
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+Btn5.getText();
				textField.setText(number);
				
			}
			
		});
		
		Btn6 = new JButton("6");
		Btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn6.setBounds(170, 219, 55, 55);
		frame.getContentPane().add(Btn6);
		
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+Btn6.getText();
				textField.setText(number);
				
			}
			
		});
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(40, 285, 55, 55);
		frame.getContentPane().add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
			
		});
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(105, 285, 55, 55);
		frame.getContentPane().add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
				
			}
			
		});
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(170, 285, 55, 55);
		frame.getContentPane().add(btn3);
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
			
		});
		
		BTNDivide = new JButton("/");
		BTNDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="/";
			}
		});
		BTNDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNDivide.setBounds(235, 285, 55, 55);
		frame.getContentPane().add(BTNDivide);
		
		BTNTimes = new JButton("*");
		BTNTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="*";
			}
		});
		BTNTimes.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNTimes.setBounds(235, 219, 55, 55);
		frame.getContentPane().add(BTNTimes);
		
		BtnSub = new JButton("-");
		BtnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="-";
			}
		});
		BtnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnSub.setBounds(235, 153, 55, 55);
		frame.getContentPane().add(BtnSub);
		
		BTNPlus = new JButton("+");
		BTNPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="+";
			}
		});
		BTNPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNPlus.setBounds(235, 87, 55, 55);
		frame.getContentPane().add(BTNPlus);
		
		Btn0 = new JButton("0");
		Btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn0.setBounds(40, 345, 55, 55);
		frame.getContentPane().add(Btn0);
		
		Btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+Btn0.getText();
				textField.setText(number);
				
			}
			
		});
		
		BTNDecimal = new JButton(".");
		BTNDecimal.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNDecimal.setBounds(105, 345, 55, 55);
		frame.getContentPane().add(BTNDecimal);
		
		BTNDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+BTNDecimal.getText();
				textField.setText(number);
				
			}
			
		});
		
		BTNEquals = new JButton("=");
		BTNEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second=Double.parseDouble(textField.getText());
				if (Operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(Operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(Operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (Operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (Operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		BTNEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNEquals.setBounds(170, 345, 55, 55);
		frame.getContentPane().add(BTNEquals);
		
		BTNPercent = new JButton("\0025");
		BTNPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="%";
			}
		});
		BTNPercent.setFont(new Font("tahoma", Font.BOLD, 18));
		BTNPercent.setBounds(235, 345, 55, 55);
		frame.getContentPane().add(BTNPercent);
	}
}