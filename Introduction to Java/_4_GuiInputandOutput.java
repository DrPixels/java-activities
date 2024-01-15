package _1_week1IntroductionToJava;



import javax.swing.JOptionPane;

public class _4_GuiInputandOutput {
	static String name;
	static int mobileNumber;
	
	public static void main(String[] args)  {
		//Wrapper Classes of Primitive Data Types
		//primitive data types
		//byte - Byte, short - Short, int - Integer, long - Long, float - Float, double - Double, char - Character, boolean - Boolean
	
		
		name = JOptionPane.showInputDialog("Enter Name: ");
		JOptionPane.showMessageDialog(null, name);
		
		mobileNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Mobile Number: "));
		JOptionPane.showMessageDialog(null, mobileNumber);
	}
}
