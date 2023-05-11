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
	private JLabel typeLabel;
	
	public ActivityPanel(Controller app) {
		setLayout(new GridLayout(0,2));
		nameLabel = new JLabel("Activity: " + app.getTitle());
		participantsLabel = new JLabel("Participants:" + app.getText());
		accessibilityLabel = new JLabel("Accessibility: " + app.getAccess());
		priceLabel = new JLabel("Price: " + app.getPri());
		typeLabel = new JLabel("Type: " + app.getIype());
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		add(nameLabel);
		add(participantsLabel);
		add(accessibilityLabel);
		add(priceLabel); 
		add(typeLabel);
		ImageIcon panda = new ImageIcon("boredpanda.png");
		JLabel label = new JLabel();
		label.setIcon(panda);
		this.add(label);
		

		
		Color PRETTY_PURPLE = new Color(198, 115, 255);
		setBackground(PRETTY_PURPLE);
		
		
		
		

		
		JButton imageLink = new JButton("imageLink");
		imageLink.setSize(100, 50);
		
	
		
		
		
	}

	
}
