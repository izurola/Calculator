package test;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import acm.program.*;
import acm.graphics.*;
public class JFrameExample extends GraphicsProgram{  
	
	public static int width = 400;
	public static int height = 500;
	
	public void init()
    {
    	addMouseListeners();
    	addKeyListeners();
    }
	
    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame ");  
        JPanel panel = new JPanel();  
        JButton button = new JButton(); 
        
        button.setText("Button"); 
        button.setBounds(150, 300, 100, 50);
        
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.red);

        frame.setLayout(null);
        frame.add(button);
        frame.add(panel); 
        
        frame.setSize(width, height);  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);  
    }  
}  