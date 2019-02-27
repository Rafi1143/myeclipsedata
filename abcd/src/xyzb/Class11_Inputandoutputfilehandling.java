package xyzb;

import java.util.Scanner;

public class Class11_Inputandoutputfilehandling {
	
	public static void main(String [] args){
	Scanner scan= new Scanner(System.in); //system.in is an input stream,stream is defined as sequence of data
	
	System.out.println("Enter Your Name");
	String name = scan.nextLine();
	System.out.println("You are Name is "+ name);
		
		
	System.out.println("Enter Your City");
	String city = scan.nextLine();
	System.out.println("Your city is "+ city);
	
	
	System.out.println("Enter a number");
	int number = scan.nextInt(); // this syntax is for small number
	System.out.println("Your number  is "+ number);	
	
	System.out.println("Enter a Mobile Number ");
	long number2 = scan.nextLong();
	System.out.println("Your Mobile number   is "+ number2);	
	
	
	System.out.println("Enter a value");
	double number3 = scan.nextDouble(); 
	System.out.println("Your value is "+ number3);
	
	System.out.println("Enter a character ");
	char a = scan.next().charAt(0); 
	System.out.println("Your Char is "+ a);
	
	System.out.println("Enter a value ");
	boolean val = scan.nextBoolean(); 
	System.out.println("Your value is "+ val);
	
	
	}

}
