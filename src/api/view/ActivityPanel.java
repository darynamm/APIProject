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
		setLayout(new GridLayout(0,1));
		nameLabel = new JLabel("Activity: " + app.getTitle());
		participantsLabel = new JLabel("Participants:" + app.getText());
		accessibilityLabel = new JLabel("Accessibility: " + app.getAccess());
		priceLabel = new JLabel("Price: " + app.getPri());
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		add(nameLabel);
		add(participantsLabel);
		add(accessibilityLabel);
		add(priceLabel); 
		ImageIcon panda = new ImageIcon("boredpanda.png");
		JLabel label = new JLabel();
		label.setIcon(panda);
		this.add(label);
		

		
		Color PRETTY_PURPLE = new Color(198, 115, 255);
		setBackground(PRETTY_PURPLE);
		
		
		
		
		
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
		imageLink.setSize(50, 50);
		
		this.add(name);
		this.add(type);
		this.add(participants);
		this.add(accessibility);
		this.add(price);
		this.add(name);
		this.add(imageLink);
		
		
	}

	
}
