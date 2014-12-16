package robot.model;

import lejos.nxt.Motor;

public class DrawingRobot
{
	
	public int calculateAngle(int vertexCount)
	{
		int currentAngle = 0;
		if(vertexCount != 0)
		{
			currentAngle = 360/vertexCount;
		}
		
		else if(vertexCount == 1)
		{
			currentAngle = 0;
		}
		
		return currentAngle;
	}
	
	public void drawShape(int vertexCount,int lenght)
	{
		int angle = calculateAngle(vertexCount);
		
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			int turnCount = 0;
			try
			{//hi
				Motor.A.forward();
				Motor.B.forward();
				Thread.sleep(lenght*1000);
				Motor.A.stop();
				Motor.B.stop();
				while(turnCount >= 3)
				{
				Motor.A.rotate(-angle,true);
				Motor.B.rotate(angle,true);
//				Motor.A.rotate(-angle,true);
//				Motor.B.rotate(angle,true);
//				Motor.A.rotate(-angle,true);
//				Motor.B.rotate(angle,true);
				turnCount++;
				}
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
		
	}
	
	
	
	
	

}
