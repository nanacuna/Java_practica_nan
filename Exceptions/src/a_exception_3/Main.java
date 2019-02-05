package a_exception_3;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		int decision;
		System.out.println("\tQué deseas hacer?");
		System.out.println("\t1. Ingresar datos.");
		System.out.println(("\t2. Salir del programa."));
		decision = entry.nextInt();
		
		if (decision == 1)
			askForData();
		else {
			System.out.println("Bye");
			System.exit(0);
		}
		entry.close();
	}
	
	static void askForData() throws InputMismatchException{
		try {
			Scanner data_entry = new Scanner(System.in);
			String user_name;
			int age;
			
			System.out.println("Enter your name, please");
			user_name = data_entry.nextLine().toUpperCase();
			System.out.println("Enter your age, please");
			age = data_entry.nextInt();
			
			System.out.println("Hi "+user_name+"\nNext year you will have "+(age+1)+ " years.");
			data_entry.close();
		}
		catch (InputMismatchException e) {
			System.out.println("You must enter a positive number");
		}
		System.out.println("We're done");
	}
}
