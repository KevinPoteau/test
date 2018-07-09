package com.projet.test;

import org.junit.Test;

import com.projet.robot.Robot;

public class RobotTest {
	
	

	
	
	@Test
	public void testRobotLeft() {
		Robot myRobot = new Robot(0, 0);
		myRobot.moveLeft(1);
		myRobot.moveDown(5);
		myRobot.moveRight(4);
		myRobot.moveUp(12);
	}
	
}
