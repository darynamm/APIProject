package api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.view.Activity;
import media.model.Turtle;
import media.model.World;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;

public class Controller
{
	
	public void start()
	{
		Activity myFirstWorld = new Activity(false);
		Activity myTurtle = new Activity(myFirstWorld);
		Activity newTurtle = new Activity(myFirstWorld);
		
		myTurtle.forward(30);
		newTurtle.forward(15);
		
		Activity otherTurtle = new Activity(myFirstWorld);
		otherTurtle.setColor(Color.magenta);
		
		Activity othernewTurtle = new Activity(myFirstWorld);
		othernewTurtle.setColor(Color.blue);
		
		for (int index = 0; index< 10; index++)
		{
			myTurtle.turn(45);;
		    myTurtle.forward(100);
		    

		    
		    int randomTurn = (int) (Math.random() * 90);
		    int randomDistance = (int) (Math.random() * 91) + 10; 
		    
		    otherTurtle.turn(45);
		    otherTurtle.backward(randomDistance);
		    othernewTurtle.turn(randomTurn);
		    othernewTurtle.backward(20);
		    othernewTurtle.setPenWidth(1*(index + 1));
		    
		   
		}
		
		myFirstWorld.setVisible(true);
	}

	}
	private static final String API_URL = "https://www.boredapi.com/api/activity/";

	public Activity getActivity() throws IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		URL url = new URL(API_URL);
		return objectMapper.readValue(url, Activity.class);
	}
}
