package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello world!");
		Robot rusty = new Robot("mini");
		rusty.sparkle();
	    rusty.setWindowColor(60, 229, 235 );
	    rusty.penDown();
	    rusty.setPenColor(176, 60, 235);
	    rusty.move(100);
	    rusty.turn(90);
	    rusty.move(100);
	    rusty.turn(90);
	    rusty.move(100);
	    rusty.turn(90);
	    rusty.move(100);
	}
}
