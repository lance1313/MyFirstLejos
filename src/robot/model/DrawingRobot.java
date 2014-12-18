package robot.model;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class DrawingRobot
{
	
	private UltrasonicSensor mySonar;
	private TouchSensor frontTouch;
	private TouchSensor backTouch;
	private SoundSensor microphone;
	
	public DrawingRobot()
	{
		mySonar = new UltrasonicSensor(SensorPort.S1);
		frontTouch = new TouchSensor(SensorPort.S2);
		backTouch = new TouchSensor(SensorPort.S3);
		microphone = new SoundSensor(SensorPort.S4);	
	}
	
	public void danceRobotDance()
	{
		
	}

	public void hasHapphephobia()
	{
		
	}

	public void driveAroundRoom()
	{
		
	}
	
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
