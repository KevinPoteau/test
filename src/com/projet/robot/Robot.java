package com.projet.robot;

public class Robot {

	//vertical
	private int pos_x;
	//horizontal
	private int pos_y;
	
	public Robot(int newpos_x, int newpos_y) {
		this.pos_x = newpos_x;
		this.pos_y = newpos_y;
	}
	
	public void getPos(){
		System.out.println("Pos X:" + this.pos_x + "\nPos Y:" + this.pos_y);
	}
	
	public void moveUp(int movement) {
		System.out.println("\nRobot movement HAUT de " + movement);
		this.pos_x = this.pos_x + movement;
		this.getPos();
		
	}

	
	public void moveDown(int movement) {
		System.out.println("\nRobot movement BAS de " + movement);
		this.pos_x = this.pos_x - movement;
		this.getPos();
		
	}
	
	public void moveLeft(int movement) {
		System.out.println("\nRobot movement GAUCHE de " + movement);
		this.pos_y = this.pos_y - movement;
		this.getPos();
		
	}
	
	public void moveRight(int movement) {
		System.out.println("\nRobot movement DROITE de " + movement);
		this.pos_y = this.pos_y + movement;
		this.getPos();
		
	}

	public int getPos_x() {
		return pos_x;
	}

	public int getPos_y() {
		return pos_y;
	}

	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}

	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	
	
}
