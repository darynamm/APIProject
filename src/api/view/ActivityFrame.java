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
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.net.URL;

public class ActivityFrame extends JFrame
{

	private Controller app;
	private ActivityPanel panel;

	public ActivityFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new ActivityPanel(this.app);

		setupFrame();

	}

	private void setupFrame()
	{

		this.setContentPane(panel);
		;
		this.setSize(1024, 768);
		this.setVisible(true);
	}

}
