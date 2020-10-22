import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	JTextField textField1;
	Calculator() {
		//Enter the Value Label
		super("Calculator");
		JLabel label1 = new JLabel("Enter The Value:");
		label1.setBounds(20, 20, 380, 40);
		label1.setFont(new Font("Calibri", Font.BOLD, 20));
		add(label1);
		//Enter the Value Field
		textField1 = new JTextField("");
		textField1.setBounds(20, 60, 540, 30);
		textField1.setFont(new Font("Calibri", Font.BOLD, 20));
		textField1.setHorizontalAlignment(JTextField.RIGHT);
		add(textField1);
		//Button +
		JButton button1 = new JButton("+");
		button1.setBounds(20, 120, 90, 30);
		button1.setFont(new Font("Calibri", Font.BOLD, 20));
		button1.addActionListener(this);
		add(button1);
		//Button -
		JButton button2 = new JButton("-");
		button2.setBounds(130, 120, 90, 30);
		button2.setFont(new Font("Calibri", Font.BOLD, 20));
		button2.addActionListener(this);
		add(button2);
		//Button *
		JButton button3 = new JButton("*");
		button3.setBounds(240, 120, 90, 30);
		button3.setFont(new Font("Calibri", Font.BOLD, 20));
		button3.addActionListener(this);
		add(button3);
		//Button /
		JButton button4 = new JButton("/");
		button4.setBounds(350, 120, 90, 30);
		button4.setFont(new Font("Calibri", Font.BOLD, 20));
		button4.addActionListener(this);
		add(button4);
		//Button AC
		JButton button5 = new JButton("AC");
		button5.setBounds(460, 120, 100, 30);
		button5.setFont(new Font("Calibri", Font.BOLD, 20));
		button5.addActionListener(this);
		add(button5);
		//Numbers
		//Button 1
		JButton button6 = new JButton("1");
		button6.setBounds(20, 170, 120, 40);
		button6.setFont(new Font("Calibri", Font.BOLD, 20));
		button6.addActionListener(this);
		add(button6);
		//Button 2
		JButton button7 = new JButton("2");
		button7.setBounds(160, 170, 120, 40);
		button7.setFont(new Font("Calibri", Font.BOLD, 20));
		button7.addActionListener(this);
		add(button7);
		//Button 3
		JButton button8 = new JButton("3");
		button8.setBounds(300, 170, 120, 40);
		button8.setFont(new Font("Calibri", Font.BOLD, 20));
		button8.addActionListener(this);
		add(button8);
		//Button 4
		JButton button9 = new JButton("4");
		button9.setBounds(440, 170, 120, 40);
		button9.setFont(new Font("Calibri", Font.BOLD, 20));
		button9.addActionListener(this);
		add(button9);
		//Button 5
		JButton button10 = new JButton("5");
		button10.setBounds(20, 230, 120, 40);
		button10.setFont(new Font("Calibri", Font.BOLD, 20));
		button10.addActionListener(this);
		add(button10);
		//Button 6
		JButton button11 = new JButton("6");
		button11.setBounds(160, 230, 120, 40);
		button11.setFont(new Font("Calibri", Font.BOLD, 20));
		button11.addActionListener(this);
		add(button11);
		//Button 7
		JButton button12 = new JButton("7");
		button12.setBounds(300, 230, 120, 40);
		button12.setFont(new Font("Calibri", Font.BOLD, 20));
		button12.addActionListener(this);
		add(button12);
		//Button 8
		JButton button13 = new JButton("8");
		button13.setBounds(440, 230, 120, 40);
		button13.setFont(new Font("Calibri", Font.BOLD, 20));
		button13.addActionListener(this);
		add(button13);
		//Button 9
		JButton button14 = new JButton("9");
		button14.setBounds(20, 290, 120, 40);
		button14.setFont(new Font("Calibri", Font.BOLD, 20));
		button14.addActionListener(this);
		add(button14);
		//Button 0
		JButton button15 = new JButton("0");
		button15.setBounds(160, 290, 120, 40);
		button15.setFont(new Font("Calibri", Font.BOLD, 20));
		button15.addActionListener(this);
		add(button15);
		//Button =
		JButton button16 = new JButton("=");
		button16.setBounds(400, 290, 160, 40);
		button16.setFont(new Font("Calibri", Font.BOLD, 20));
		button16.addActionListener(this);
		add(button16);
		//
		setLayout(null);
		setSize(600,390);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton tmp = (JButton)e.getSource();
		if(tmp.getText().equals("AC")) {
			textField1.setText("");
		}
		else if(tmp.getText().equals("=")) {
			
	    	ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    try {
				textField1.setText(String.valueOf(engine.eval(textField1.getText())));
			} catch (ScriptException e1) {
				e1.printStackTrace();
			}
	    }
	    else {
	    	textField1.setText(textField1.getText()+tmp.getText());
	    }
	}

}
