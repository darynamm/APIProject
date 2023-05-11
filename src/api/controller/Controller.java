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

	private static final String API_URL = "https://www.boredapi.com/api/activity";

	private Activity getActivity() 
	{
		Activity current = new Activity("","",0,0,0,"" );
		try
		{
			ObjectMapper objectMapper = new ObjectMapper();
			URL url = new URL(API_URL);
			current = objectMapper.readValue(url, Activity.class);
			System.out.println(current.getActivity());
		}
		catch(IOException error)
		{
			System.out.println("data error");
			System.out.println(error.getMessage());
		}
		return current;
		
	}
	
	
	public String getTitle() 
	{
		return current.getActivity();
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
