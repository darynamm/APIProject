package api.tests;

import api.controller.Controller; //Change!
import api.view.ActivityPanel; //Change!
import api.view.ActivityFrame; //Change!
import javax.swing.*;

import java.awt.Component;
/**
 * Reflection imports
 */
import java.lang.reflect.*;
/**
 * Testing imports
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrameTest
{
	private Controller testedController; //Change!
	private ActivityFrame testedFrame; //Change!

	@BeforeEach
	void setUp() throws Exception
	{
		this.testedController = new Controller();
		this.testedFrame = new ActivityFrame(testedController);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		this.testedController = null;
		this.testedFrame = null;
	}

	@Test
	void testChatFrame()
	{
		assertTrue(testedFrame instanceof JFrame, "... needs to extend JFrame");
		Method [] methods = testedFrame.getClass().getDeclaredMethods();
		assertTrue(methods.length == 1, "You need 1 method in the ActivityFrame");
		assertTrue(testedFrame.getTitle().length() < 5, "Your title needs at least 6 letters");
		assertTrue(testedFrame.getContentPane() instanceof ActivityPanel, "Your ChatFrame needs to have a ChatPanel inside");  //Change!
	}

}