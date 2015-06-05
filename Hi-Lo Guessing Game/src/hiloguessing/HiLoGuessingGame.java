package hiloguessing;

import java.util.Random;
import java.util.Scanner;

public class HiLoGuessingGame {

	public static void main(String[] args) {
	
		int guessNumber, answer, count = 0;
		final int Max = 100;
		String input = "y";

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		while (input.equalsIgnoreCase("y"))
		{
			answer = generator.nextInt(Max) + 1;
			System.out.print("Guess a number between 1 and 100: ");
			guessNumber = scan.nextInt();
			count = 0;
			while (guessNumber != 0) {
				if (guessNumber > answer) 
				{
					count++;
					System.out.println("Your guessing number is not correct. The number of guesses is "
									+ count + ".");
					System.out.println("The guessing number is too high. Please enter a new number or quit (0 to quit): ");
									guessNumber = scan.nextInt();}
				

					else if (guessNumber < answer) 
					
					{count++;
					System.out.println("Your guessing number is not correct. The number of guesses is "
									+ count + ".");
					System.out.println("The guessing number is too low. Please enter a new number or quit (0 to quit): ");
									guessNumber = scan.nextInt();}
				

					else
					{count++;
					System.out.println("Your guessing number is correct. The answer is "
									+ answer
									+ " . The number of guesses is "
									+ count + ".");
					guessNumber = 0;}
				
			}
		
				
				System.out.print("Would you like to play again? (y/n):  ");
				scan.nextLine();
				input = scan.nextLine();
				
				if (input.equalsIgnoreCase("n"))
					System.out.print ("The game is end.");
	
		}
	}}
