package rock;
import java.util.Scanner;
import java.util.Random;

public class Rock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String personPlay;
	String computerPlay="";
	int computerInt;
	String again = "y";

	Scanner scan= new Scanner (System.in);
	Random generator = new Random();
	System.out.println("Rock, Paper, Scissors Game");
	while (again.equalsIgnoreCase("y"))
	{
	System.out.print("Enter your play(R P, or S): ");
	personPlay=scan.nextLine();

	computerInt = generator.nextInt(3);
	
	switch(computerInt)
	{case 0:
		computerPlay="R";
		System.out.println("Computer play is "+ computerPlay);
		break;
	case 1:
		computerPlay="P";
		System.out.println("Computer play is "+ computerPlay);
		break;
	case 2:
		computerPlay="S";
		System.out.println("Computer play is "+ computerPlay);
		break;
	}
	
	
	if (personPlay.equalsIgnoreCase(computerPlay))
		{System.out.println("It's a tie!");}
	else if (personPlay.equalsIgnoreCase("R"))
	
		{if (computerPlay.equalsIgnoreCase("S"))
			System.out.println("Rock crushes scissors. You win!!");
			else if (computerPlay.equalsIgnoreCase("P"))
			System.out.println("Paper covers rock. You lose!");}
	else if (personPlay.equalsIgnoreCase("P"))
		{if (computerPlay.equalsIgnoreCase("R"))
			System.out.println("Paper covers rock. You win!!");
			else if (computerPlay.equalsIgnoreCase("S"))
			System.out.println("Scissors cut paper. You lose!");}
	else if (personPlay.equalsIgnoreCase("S"))
		{if (computerPlay.equalsIgnoreCase("R"))
			System.out.println("Rock crushes scissors. You lose!");
		else if (computerPlay.equalsIgnoreCase("P"))
			System.out.println("Scissors cut paper. You win!!");}
	
	System.out.print("Do you want to play again(y/n)?");
	again=scan.nextLine();
	}
	
System.out.print("The game is end.");
	
}
	

}


