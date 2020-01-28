package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObeDient_RobOt {
	static Robot Rob = new Robot();
	static void drawSquare() {
		
		Rob.setSpeed(100);
		Rob.penDown();
	  for(int i = 0; i < 4; i++)
		{
		Rob.move(90);
		Rob.turn(90);
		}
	  }
	static void drawTriangle() {
			
			Rob.penDown();
			Rob.setSpeed(100);
			for(int i = 0; i < 3; i++)
			{
				Rob.move(100);
				Rob.turn(60);
			}
		  }
	
	static void drawCircle() {
		
		Rob.penDown();
		Rob.setSpeed(100);
		for(int i = 0; i < 360; i++)
		{
			Rob.move(2);
			Rob.turn(1);
		}
	  }
	
	  
	public static void main(String[] args) {
		Rob.setSpeed(100);
		String Jeff = JOptionPane.showInputDialog("What shape do you want. I have circle, triangle, and square. Use lowercase.");
		String Jeffy = JOptionPane.showInputDialog("What colour do you want, I have red and green. Use lowercase.");
		if(Jeffy.equals("red"))
		{
			Rob.setPenColor(Color.red);
		}
		else
		if(Jeffy.equals("green"))
		{
			Rob.setPenColor(Color.green);	
		}
		if(Jeff.equals("circle"))
		{
			drawCircle();
		}
		else 
			if(Jeff.equals("triangle"))
			{
				drawTriangle();
			}
			else 
				if(Jeff.equals("square"))
				{
					drawSquare();
				}
		

	}

}
