package application;

import java.util.Scanner;
import java.util.Random;

public class application {

	public static void main(String[] args) {

		String FirstName, LastName, firstLetter, lastLetter;
		int RandomNum;

		Random generator = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("First Name: ");
		FirstName = scan.nextLine();
		System.out.print("Last Name (last name is at least five letters): ");
		LastName = scan.nextLine();
		
		firstLetter = FirstName.substring(0, 1);
		lastLetter = LastName.substring(0, 5);
		RandomNum = generator.nextInt(90) + 10;

		System.out.print("Your username for new computer accounts is : "
				+ firstLetter + lastLetter + RandomNum);

	}

}
