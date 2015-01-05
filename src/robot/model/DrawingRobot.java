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
	private int drive;
	
	public DrawingRobot()
	{
		mySonar = new UltrasonicSensor(SensorPort.S4);
		frontTouch = new TouchSensor(SensorPort.S1);
		backTouch = new TouchSensor(SensorPort.S2);
		microphone = new SoundSensor(SensorPort.S3);	
		drive = 0;
	}
	
	public void driving()
	{
		if(microphone.readValue() >= 40)
		{
			danceRobotDance(5, 1);
		}
		else if(frontTouch.isPressed())
		{
			hasHapphephobia(3,1);
		}
		else if(backTouch.isPressed())
		{
			hasHapphephobia(3,1);
		}
		else if(mySonar.getDistance() >= 30)
		{
			driveAroundRoom(2,1);
		}
		else
		{
			Motor.A.forward();
			Motor.B.forward();
		}
	
		
	}
	
	
	/**
	 * called when mic. is activated.
	 * @param vertexCount this is the number of turns
	 * @param lenght how far to go forward.
	 */
	public void danceRobotDance(int vertexCount,int lenght)
	{
		int angle = calculateAngle(vertexCount);
		//this is telling it how far away to be when it turns from an object in the way.

				int turnCount = 0;
				try
				{//hi
					
					Motor.A.stop();
					Motor.B.stop();
					while(turnCount >= 3)
					{
					Motor.A.rotate(-angle,true);
					Motor.B.rotate(angle,true);
					turnCount++;
					}
					Motor.A.forward();
					Motor.B.forward();
					
				}
				catch(Exception threadException)
				{
					System.out.print(threadException.getMessage());
				}
			
		
		
	}
	/**
	 * called when the touch sensors are activated.
	 * @param vertexCount
	 * @param lenght
	 */
	public void hasHapphephobia(int vertexCount,int lenght)
	{
		int angle = calculateAngle(vertexCount);
		
		//this sas what to do when the front touch sensor is activated
		 if(frontTouch.isPressed())
		 {
			
				int turnCount = 0;
				try
				{//hi
					
					
					
					Motor.A.backward();
					Motor.b.backward();
					while(turnCount >= 3)
					{
					Motor.A.rotate(-angle,true);
					Motor.B.rotate(angle,true);
					turnCount++;
					}
					Motor.A.forward();
					Motor.B.forward();
				}
				catch(Exception threadException)
				{
					System.out.print(threadException.getMessage());
				}
			
		}
		 
		//this tells it what to do when the rear touch sensor is activated.
			if(backTouch.isPressed())
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
						turnCount++;
						}
					}
					catch(Exception threadException)
					{
						System.out.print(threadException.getMessage());
					}
				
			}
	}
/**
 * called when sonar is activated.
 * @param vertexCount
 * @param lenght
 */
	public void driveAroundRoom(int vertexCount,int lenght)
	{
		int angle = calculateAngle(vertexCount);
		
		
			
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
					turnCount++;
					}
				}
				catch(Exception threadException)
				{
					System.out.print(threadException.getMessage());
				}

	}
	
	public int calculateAngle(int vertexCount)
	{
		int currentAngle = 0;
		if(vertexCount != 0)
		{
			currentAngle = 360/vertexCount;
		}
		

		
		return currentAngle;
	}
	
	public void drawShape(int vertexCount,int lenght)
	{
		int angle = calculateAngle(vertexCount);
		int shapeCount = 0;
		
		//this draws a circle
		if(shapeCount == 0)
		{
//			drawShape(4,1);
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			int turnCount = 0;
			try
			{//hi
				Motor.A.forward();
				Motor.B.forward();
				Thread.sleep(lenght*1500);
				Motor.A.forward();
				Motor.B.backward();
				Thread.sleep(lenght*700);
				Motor.A.stop();
				Motor.B.stop();
				
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
		shapeCount++;
		}
		
		//this draws a square
//		else if(shapeCount == 1)
//		{
//			
//			for(int drawCount = 0; drawCount < vertexCount; drawCount++)
//			{
//				int turnCount = 0;
//				try
//				{//hi
//					Motor.A.forward();
//					Motor.B.forward();
//					Thread.sleep(lenght*1000);
//					Motor.A.stop();
//					Motor.B.stop();
//					while(turnCount >= 3)
//					{
//					Motor.A.rotate(-angle,true);
//					Motor.B.rotate(angle,true);
////					Motor.A.rotate(-angle,true);
////					Motor.B.rotate(angle,true);
////					Motor.A.rotate(-angle,true);
////					Motor.B.rotate(angle,true);
//					turnCount++;
//					}
//				}
//				catch(Exception threadException)
//				{
//					System.out.print(threadException.getMessage());
//				}
//			}
//			shapeCount++;
//		}
//			
//		//this draws a triangle
//			else if(shapeCount == 2)
//			{
//				for(int drawCount = 0; drawCount < vertexCount; drawCount++)
//				{
//					int turnCount = 0;
//					try
//					{//hi
//						Motor.A.forward();
//						Motor.B.forward();
//						Thread.sleep(lenght*1000);
//						Motor.A.stop();
//						Motor.B.stop();
//						while(turnCount >= 3)
//						{
//						Motor.A.rotate(-angle,true);
//						Motor.B.rotate(angle,true);
////						Motor.A.rotate(-angle,true);
////						Motor.B.rotate(angle,true);
////						Motor.A.rotate(-angle,true);
////						Motor.B.rotate(angle,true);
//						turnCount++;
//						}
//					}
//					catch(Exception threadException)
//					{
//						System.out.print(threadException.getMessage());
//					}
//				}
//				shapeCount++;
//			}
//			
//		//this draws a hexagon
//			else if(shapeCount == 3)
//			{
//				for(int drawCount = 0; drawCount < vertexCount; drawCount++)
//				{
//					int turnCount = 0;
//					try
//					{//hi
//						Motor.A.forward();
//						Motor.B.forward();
//						Thread.sleep(lenght*1000);
//						Motor.A.stop();
//						Motor.B.stop();
//						while(turnCount >= 3)
//						{
//						Motor.A.rotate(-angle,true);
//						Motor.B.rotate(angle,true);
////						Motor.A.rotate(-angle,true);
////						Motor.B.rotate(angle,true);
////						Motor.A.rotate(-angle,true);
////						Motor.B.rotate(angle,true);
//						turnCount++;
//						}
//					}
//					catch(Exception threadException)
//					{
//						System.out.print(threadException.getMessage());
//					}
//				}
//				shapeCount++;
//			}
//		
//			//this draws an octagon.
//			else if(shapeCount == 4)
//			{
//				for(int drawCount = 0; drawCount < vertexCount; drawCount++)
//				{
//					int turnCount = 0;
//					try
//					{//hi
//						Motor.A.forward();
//						Motor.B.forward();
//						Thread.sleep(lenght*1000);
//						Motor.A.stop();
//						Motor.B.stop();
//						Motor.A.rotateTo(90);
//						while(turnCount >= 3)
//						{
//						Motor.A.rotate(-angle,true);
//						Motor.B.rotate(angle,true);
////						Motor.A.rotate(-angle,true);
////						Motor.B.rotate(angle,true);
////						Motor.A.rotate(-angle,true);
////						Motor.B.rotate(angle,true);
//						turnCount++;
//						}
//					}
//					catch(Exception threadException)
//					{
//						System.out.print(threadException.getMessage());
//					}
//				}
//				shapeCount++;
//			}
//			
//			
//			
//			else if(shapeCount == 5)
//			{
//				shapeCount = 0;
//			}
		
		
		
		//this is the 2nd part of the project.
//		driveAroundRoom(1, 3);
//		hasHapphephobia(1,3);
//		danceRobotDance(1,3);
		
		
		
	}

	
	
	
	
	
	

}
