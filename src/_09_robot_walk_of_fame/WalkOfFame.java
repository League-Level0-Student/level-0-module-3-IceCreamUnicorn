
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		
		Robot rob = new Robot();
		rob.penDown();
		int y = 90;
		for(int i = 0; i < 12; i++) {
		// 1. Set the X position of the robot so that it starts on the left. 
		
				rob.setX(y);
				y+=50;
		// You also need to show the robot to see the result of this line.
		rob.setSpeed(100);
		// 2. Make the robot draw a star shape. Hint: 144.
				for(int o = 0; o < 5; o++)
				{
				rob.move(30);
				rob.turn(144);
			
				}
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
