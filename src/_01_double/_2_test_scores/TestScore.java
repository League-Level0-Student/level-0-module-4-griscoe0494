package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {
public static void main(String[]args) {
	String score = JOptionPane.showInputDialog(null, "What is your test score?");
	double scoreAsInt = Integer.parseInt(score);
	if(scoreAsInt >= 80) {
		JOptionPane.showMessageDialog(null,"Wow! You must have studied very heard for that test!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You tried your best.");
	}
}
}

//Write code to ask the user for their test score.
//Your program MUST allow the user to enter a test score that has a DECIMAL, e.g. 75.5
//Give them a different message according to their score.
//Example, for a good score: "Wow! You must have studied really hard for that test!"

//HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double. 