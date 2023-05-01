package api.view;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import api.controller.Controller;
import api.view.Activity;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.net.URL;


public class ActivityFrame extends JFrame
{

	public static void main(String[] args) {
		
	
		ImageIcon logo = new ImageIcon("");
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Activities from the Bored API :)");
		frame.setSize(800,600);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		ImageIcon panda = new ImageIcon("boredpanda.png");
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setIconImage(panda.getImage());
		frame.setVisible(true);
		
		
	}
}
