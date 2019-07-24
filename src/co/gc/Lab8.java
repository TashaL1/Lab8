package co.gc;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10): ");
		int numberRange = Validator.getInt(scan, "That student does not exist. Please try again. (enter a number between 1 -10: ", 1, 10);
		System.out.println(numberRange);
		int person;
		person = scan.nextInt();
		
		String[] students = { "Kevon", "Q", "Atiba", "Rusty", "Brian", "Kevin", "Kiara", "Sean", "Ben", "Somebody" };
		//System.out.println(Arrays.toString(students));

		String[] studentFood = { "Tacos", "Spaghetti", "Pizza", "Ice Cream", "Cookies", "Fish", "Hot Dogs", "Cheese",
				"Chicken", "Steak" };

		String[] studentHomeTown = { "Detroit", "Rochester", "Farmington Hills", "Troy", "Bloomfield Hills",
				"Royal Oak", "Oak Park", "Detroit", "Southfield", "Birmingham" };


		String cont;
		do {
			System.out.println("Student " + person + " is " + students[person - 1] + ". What would you like to know about " + students[person - 1] + "?");
			String answer;
			
			System.out.print("(enter hometown or favorite food): ");
			answer = scan.next();
			if (answer.equalsIgnoreCase("hometown")) {
				System.out.println(students[person - 1] + " is from " + studentHomeTown[person - 1] + ".");
			} if (answer.equalsIgnoreCase("food")) {
				System.out.println(students[person - 1] + "'s favorite food is " + studentFood[person - 1] + ".");
			}
			System.out.println("Would you like to know more? (enter yes or no): ");
			Scanner scan1 = new Scanner(System.in);
			cont = scan1.next();
		} while (cont.equalsIgnoreCase("yes"));

		if (cont.equalsIgnoreCase("no")); 
		System.out.println("Thanks!");

		
		
		scan.close();
	}

}
