package api.view;
import api.view.Activity;

import javax.swing.*;
import java.awt.*;
import api.controller.Controller;
public class ActivityPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel participantsLabel;
	private JLabel accessibilityLabel;
	private JLabel priceLabel;
	
	public ActivityPanel(Controller app) {
		setLayout(new GridLayout(4,1));
		nameLabel = new JLabel("Activity: " + app.getTitle());
		participantsLabel = new JLabel("Participants:" + app.getText());
		accessibilityLabel = new JLabel("Accessibility: " + app.getAccess());
		priceLabel = new JLabel("Price: " + app.getPri());
		add(nameLabel);
		add(participantsLabel);
		add(accessibilityLabel);
		add(priceLabel);
	}
	
	private void SetupFrame()
	{
		ImageIcon panda = new ImageIcon("boredpanda.png");
		JLabel label = new JLabel();
		label.setIcon(panda);
		this.add(label);
		this.getRootPane().add(label);
		ImageIcon logo = new ImageIcon("");

		JFrame frame = new JFrame();
		
		this.setSize(800, 600);

		this.setLocation(null);
		this.setVisible(false);

		
		Color PRETTY_PURPLE = new Color(198, 115, 255);
		getRootPane().setBackground(new java.awt.Color(198, 115, 255));
		
		
		frame.setLayout(new FlowLayout());
		
		
		JButton name = new JButton("name");
		name.setSize(15, 15);	
		
		JButton type = new JButton("type");
		type.setSize(15, 15);	
		
		JButton participants = new JButton("participants");
		participants.setSize(15, 15);	
		
		JButton accessibility = new JButton("accessibility");
		accessibility.setSize(15, 15);
		

		JButton price = new JButton("price");
		price.setSize(15, 15);
		
		
		JButton imageLink = new JButton("imageLink");
		imageLink.setSize(15, 15);
		
		this.add(name);
		this.add(type);
		this.add(participants);
		this.add(accessibility);
		this.add(price);
		this.add(name);
		this.add(imageLink);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);

	}

	private void setDefaultCloseOperation(int exitOnClose)
	{
		
		
	}

}
