/* 
 *  Author: Dustin Kerrigan 
 *  Title  : GUI
 *  Survey GUI. Writes data to file. 
 */ 
import javax.swing.JFrame;
/** 
 * Main. 
 */ 
public class GUI {

	public static void main(String [] args) {

		CustomJFrame cj = new CustomJFrame(); //constructor call

		cj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cj.pack();
		cj.setVisible(true);

	}

}
