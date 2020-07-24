package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend= false;
		// Write code to ask the user what day it is.
        String isTheWeekend=JOptionPane.showInputDialog(null,"What day is it?");
		// Set the boolean isWeekend based on the value they enter
		while (isTheWeekend != null) {
        if(isTheWeekend.equalsIgnoreCase("Saturday")) {
        	isWeekend=true;
        	JOptionPane.showMessageDialog(null, "You get to sleep in");
        }
        else {
        	JOptionPane.showMessageDialog(null, "Get out of bed and go to school");
        }
       
		}
        
		
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam=false;
		// Write code to ask the user what percentage they scored in their last exam
		while(passedExam) {
			passedExam=true;
		String passed=JOptionPane.showInputDialog(null,"What did you score on your last exam?");
		int passedAsInt=Integer.parseInt(passed);
		if(passedAsInt>=70) {
			JOptionPane.showMessageDialog(null, "Congratulations! You passed.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You will do better next time.");
		}
		
		}
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
			JOptionPane.showMessageDialog(null,"Game is over");
		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		while(isRed) {
		String red = JOptionPane.showInputDialog(null,"What color do you want to draw with?");
		if(red.equalsIgnoreCase("red")) {
			isRed = true;
		}
		
		}
		boolean isSquare = false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		while(isSquare) {
		String square = JOptionPane.showInputDialog(null,"What shape do you want to draw?");
		if(square.equalsIgnoreCase("Square")) {
			isSquare = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that shape.");
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		
		}
	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
