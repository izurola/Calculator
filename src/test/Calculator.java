package test;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.JTextField;

import acm.program.*;
import acm.graphics.*;
public class Calculator implements ActionListener{  
	
	int width = 400;
	int height = 500;
	JFrame frame = new JFrame("JFrame ");  
	JPanel panel = new JPanel();  
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[10];
	JButton negBut,uldBut,addBut,subBut,multBut,divBut,decBut,equBut,delBut,clrBut;
	Font myFont = new Font("Int Free",Font.BOLD,30);
	JTextField textfield = new JTextField();
	double num1,num2,result=0;
	char op;
	
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
	}
	
	Calculator() {  
            
        frame.setSize(width, height);  
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
                
        textfield.setBounds(10, 10, 365, 105);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        
        addBut = new JButton("+");
        subBut = new JButton("-");
        multBut = new JButton("*");
        divBut = new JButton("/");
        decBut = new JButton(".");
        equBut = new JButton("=");
        delBut = new JButton("Del");
        clrBut = new JButton("Clr");
        uldBut = new JButton("%");
        negBut = new JButton("(-)");
        
        functionButtons[0]=addBut;
        functionButtons[1]=subBut;
        functionButtons[2]=multBut;
        functionButtons[3]=divBut;
        functionButtons[4]=decBut;
        functionButtons[5]=equBut;
        functionButtons[6]=delBut;
        functionButtons[7]=clrBut;
        functionButtons[8]=uldBut;
        functionButtons[9]=negBut;
        
        for(int i=0;i<10;i++)
        {
        	functionButtons[i].addActionListener(this);
        	functionButtons[i].setFont(myFont);
        	functionButtons[i].setFocusable(false);
        }
        
        for(int i=0;i<10;i++)
        {
        	numberButtons[i] = new JButton(String.valueOf(i));
        	numberButtons[i].addActionListener(this);
        	numberButtons[i].setFont(myFont);
        	numberButtons[i].setFocusable(false);
        }
                
        panel.setBounds(10,125,365,325);
        panel.setLayout(new GridLayout(5,4,10,10));
//      panel.setBackground(Color.GRAY);
        
        panel.add(clrBut);
        panel.add(delBut);
        panel.add(uldBut);
        panel.add(divBut);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multBut);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subBut);
        panel.add(numberButtons[3]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[1]);
        panel.add(addBut);
        panel.add(numberButtons[0]);
        panel.add(decBut);
        panel.add(negBut);
        panel.add(equBut);
        
        frame.add(textfield);
        frame.setLayout(null);
        frame.add(panel); 
        frame.setVisible(true);      
    }  
    public void actionPerformed(ActionEvent e)
    {
    	for(int i=0;i<10;i++)
    	{
    		if(e.getSource()==numberButtons[i])
    		{
    			textfield.setText(textfield.getText().concat(String.valueOf(i)));
    			
    		}
    	}
    	if(e.getSource()==decBut)
    	{
    		textfield.setText(textfield.getText().concat("."));
    	}
    	if(e.getSource()==subBut)
    	{
    		num1=Double.parseDouble(textfield.getText());
    		op='-';
    		textfield.setText("");
    	}
    	if(e.getSource()==addBut)
    	{
    		num1=Double.parseDouble(textfield.getText());
    		op='+';
    		textfield.setText("");
    	}
    	if(e.getSource()==multBut)
    	{
    		num1=Double.parseDouble(textfield.getText());
    		op='*';
    		textfield.setText("");
    	}
    	if(e.getSource()==divBut)
    	{
    		num1=Double.parseDouble(textfield.getText());
    		op='/';
    		textfield.setText("");
    	}
    	if(e.getSource()==uldBut)
    	{
    		num1=Double.parseDouble(textfield.getText());
    		op='%';
    		textfield.setText("");
    	}
    	if(e.getSource()==equBut)
    	{
    		num2=Double.parseDouble(textfield.getText());
    		if(op=='-')
    		{
    			result=num1-num2;
    		}
    		else if(op=='+')
    		{
    			result=num1+num2;
    		}
    		else if(op=='*')
    		{
    			result=num1*num2;
    		}
    		else if(op=='/')
    		{
    			result=num1/num2;
    		}
    		else if(op=='%')
    		{
    			result=num1%num2;
    		}
    		textfield.setText(String.valueOf(result));
    		num1=result;
    	}
    	if(e.getSource()==delBut)
    	{
    		String str=textfield.getText();
    		int len=str.length();
    		StringBuilder sb= new StringBuilder(str);
    		sb.deleteCharAt(len-1);
    		str=sb.toString();
    		textfield.setText(str);
    	}
    	if(e.getSource()==clrBut)
    	{
    		textfield.setText("");
    	}
    }
}  