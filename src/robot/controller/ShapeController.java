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
			myBot.driving();
			
//			if(shapeCount == 0)
//			{
//			myBot.drawShape(1, 1);
//			
//			shapeCount++;
//			}
//			
//			else if(shapeCount == 1)
//			{
//			myBot.drawShape(4, 1);
//			
//			shapeCount++;
//			}
//			
//			else if(shapeCount == 2)
//			{
//			myBot.drawShape(3, 1);
//			
//			shapeCount++;
//			}
//			
//			else if(shapeCount == 3)
//			{
//			myBot.drawShape(6, 1);
//			
//			shapeCount++;
//			}
//			
//			else if(shapeCount == 4)
//			{
//			myBot.drawShape(8, 1);
//			
//			shapeCount++;
//			}
//			
//			if(shapeCount == 5)
//			{
//				shapeCount = 0;
//			}
		}
		
	}

}
