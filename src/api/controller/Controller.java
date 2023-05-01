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
	public Controller() {
		frame = new ActivityFrame();
	}

	public void start()
	{

	}

	private static final String API_URL = "https://www.boredapi.com/api/activity/";

	public Activity getActivity() throws IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		URL url = new URL(API_URL);
		return objectMapper.readValue(url, Activity.class);
	}
}
