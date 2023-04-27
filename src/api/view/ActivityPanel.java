package api.view;
import model.Activity;

import javax.swing.*;
import java.awt.*;

public class ActivityPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel participantsLabel;
	private JLabel accessibilityLabel;
	private JLabel priceLabel;
	
	public ActivityPanel(Activity activity) {
		setLayout(new GridLayout(4,1));
		nameLabel = new JLabel("Activity: " + activity.getName());
		participantsLabel = new JLabel("Participants:" + activity.getParticipants());
		accessibilityLabel = new JLabel("Accessibility: " + activity.getAccessibility());
		priceLabel = new JLabel("Price: " + activity.getPrice());
		add(nameLabel);
		add(participantsLabel);
		add(accessibilityLabel);
		add(priceLabel);
	}
}
