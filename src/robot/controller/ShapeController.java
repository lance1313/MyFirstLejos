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
		int shapeCount = 0;
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			if(shapeCount == 0)
			{
			myBot.drawShape(1, 1);
			//drawShape(myBot.angle()/*num of rotates*/,myBot.angle()/*how long forward*/)
			shapeCount++;
			}
			
			else if(shapeCount == 1)
			{
			myBot.drawShape(4, 1);
			//drawShape(myBot.angle()/*num of rotates*/,myBot.angle()/*how long forward*/)
			shapeCount++;
			}
			
			else if(shapeCount == 2)
			{
			myBot.drawShape(3, 1);
			//drawShape(myBot.angle()/*num of rotates*/,myBot.angle()/*how long forward*/)
			shapeCount++;
			}
			
			else if(shapeCount == 3)
			{
			myBot.drawShape(6, 1);
			//drawShape(myBot.angle()/*num of rotates*/,myBot.angle()/*how long forward*/)
			shapeCount++;
			}
			
			else if(shapeCount == 4)
			{
			myBot.drawShape(8, 1);
			//drawShape(myBot.angle()/*num of rotates*/,myBot.angle()/*how long forward*/)
			shapeCount++;
			}
			
			if(shapeCount == 5)
			{
				shapeCount = 0;
			}
		}
		
	}

}
