package api.view;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import api.controller.Controller;
import api.view.Activity;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.FlowLayout;
import java.net.URL;

public class ActivityFrame extends JFrame
{

	public ActivityFrame()
	{
		SetupFrame();

	}

	private void SetupFrame()
	{
		ImageIcon panda = new ImageIcon("boredpanda.png");
		JLabel label = new JLabel();
		label.setIcon(panda);
		this.add(label);
		this.getContentPane().add(label);
		ImageIcon logo = new ImageIcon("");

		JFrame frame = new JFrame();
		this.setTitle("Activities from the Bored API :)");
		this.setSize(800, 600);

		this.setLocationRelativeTo(null);
		this.setResizable(false);

		
		Color PRETTY_PURPLE = new Color(198, 115, 255);
		getContentPane().setBackground(new java.awt.Color(198, 115, 255));
		
		
		frame.setLayout(new FlowLayout());
		
		
		JButton name = new JButton("name");
		JButton type = new JButton("type");
		JButton participants = new JButton("participants");
		JButton accessibility = new JButton("accessibility");
		JButton price = new JButton("price");
		JButton imageLink = new JButton("imageLink");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);

	}

}
