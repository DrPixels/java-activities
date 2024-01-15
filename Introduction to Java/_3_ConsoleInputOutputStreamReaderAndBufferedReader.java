package _1_week1IntroductionToJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_ConsoleInputOutputStreamReaderAndBufferedReader {
	static String name;
	static String course;
	static String section;
	static long mobileNumber;
	static short age;

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(inReader);
		
		System.out.print("Enter Name: ");
		name = bReader.readLine();

		System.out.print("Enter Course: ");
		course = bReader.readLine();
		
		System.out.print("Enter Section: ");
		section = bReader.readLine();
		
		System.out.print("Enter Mobile Number: ");
		mobileNumber = Long.parseLong(bReader.readLine());

		System.out.print("Enter Age: ");
		age = Short.parseShort(bReader.readLine());
		

		
		System.out.println("Hello " + name);
		System.out.println("Course: " + course);
		System.out.println("Section: " + section);
		System.out.println("Mobile No. " + mobileNumber);
		System.out.println("Age: " + age);
	}

}
