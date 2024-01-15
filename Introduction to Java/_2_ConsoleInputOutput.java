package _1_week1IntroductionToJava;

import java.util.Scanner;

public class _2_ConsoleInputOutput {
	
	static String name;
	static String course;
	static String section;
	static long mobileNumber;
	static short age;
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Name: ");
	name = scan.next();

	
	System.out.print("Enter Course: ");
	course = scan.next();

	
	System.out.print("Enter Section: ");
	section = scan.next();

	
	System.out.print("Enter Mobile Number: ");
	mobileNumber = scan.nextLong();
	
	
	System.out.print("Enter Age: ");
	age = scan.nextShort();
	
	//for printing
	System.out.println("Hello " + name);
	System.out.println("Course: " + course);
	System.out.println("Course: " + section);
	System.out.println("You are connected to " + mobileNumber);
	System.out.println("You're " + age + " years old");
	}

}
