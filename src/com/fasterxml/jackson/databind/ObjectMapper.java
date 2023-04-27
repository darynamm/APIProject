package com.fasterxml.jackson.databind;

import java.net.URL;

import api.view.Activity;

public class ObjectMapper
{

	public Activity readValue(URL https://www.boredapi.com/api/activity/, Class<Activity> class1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	 public void testJackson() throws IOException {  
	  ObjectMapper mapper = new ObjectMapper(); 
	  File from = new File(""); 
	  TypeReference<HashMap<String,Object>> typeRef 
	      = new TypeReference<HashMap<String,Object>>() {};

	  HashMap<String,Object> o = mapper.readValue(from, typeRef); 
	  System.out.println("Got " + o); 
	}

}
