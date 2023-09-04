/* 
 *  Author: Dustin Kerrigan 
 *  Course: COP3503 
 *  Project #: 4
 *  Title  : GUI
 *  Due Date:  12/11/2022 
 *  
 *  Survey GUI. Writes data to file. 
 */ 
import javax.swing.JFrame;
/** 
 * Main. 
 */ 
public class Project4 {

	public static void main(String [] args) {

		CustomJFrame cj = new CustomJFrame(); //constructor call

		cj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cj.pack();
		cj.setVisible(true);

	}

}
