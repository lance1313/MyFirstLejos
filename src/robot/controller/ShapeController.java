package robot.controller;

import robot.model.DrawingRobot;
import lejos.nxt.Button;
import lejos.nxt.Motor;

public class ShapeController
{
	 //static DrawingRobot myBot; 
	private static DrawingRobot myBot = new DrawingRobot();
	
	public ShapeController()
	{
		
	}
	
	public static void Start()
	{
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
	
			myBot.drawShape(3/*num of rotates*/,1/*how long forward*/);
		}
		
	}

}
