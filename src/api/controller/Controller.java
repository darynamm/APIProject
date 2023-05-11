package api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.view.Activity;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import api.view.ActivityFrame;

public class Controller
{

	private ActivityFrame frame;
	private Activity current;

	public Controller()
	{
		current = getActivity();
		frame = new ActivityFrame(this);
	}

	public void start()
	{

	}

	private static final String API_URL = "https://www.boredapi.com/path/to/endpoint?api=activity&more_parameters=value2ofN&keep_on_going=another%20answer";

	private Activity getActivity() 
	{
		Activity current = new Activity("","",0,0,0,"" );
		try
		{
			ObjectMapper objectMapper = new ObjectMapper();
			URL url = new URL(API_URL);
			current = objectMapper.readValue(url, Activity.class);
		}
		catch(IOException error)
		{
			
		}
		return current;
		
	}
	
	
	public String getTitle() 
	{
		return current.getName();
	}
	public String getText()
	{
		return current.getParticipants() + "";
	}
	public String getAccess()
	{
		return current.getAccessibility() + "";
	}
	public String getPri()
	{
		return current.getPrice() + "";
	}
	
}
