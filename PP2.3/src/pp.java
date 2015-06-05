import java.util.Scanner;

public class pp {

	public static void main(String[] args) {
		// String Name, College, Petname, Age;

		Scanner scan = new Scanner(System.in);

		System.out.println("Name:");

		String Name = scan.nextLine();

		System.out.println("Age:");

		String Age = scan.nextLine();

		System.out.println("College:");

		String College = scan.nextLine();
		
		System.out.println("Petname:");

		String Petname = scan.nextLine();

		System.out.println("Hello, my name is " + Name + " and I am  " + Age
				+ "  years \n old. I¡¯m enjoying my time at " + College
				+ ", though \n I miss my pet " + Petname + " very much!");

	}
}
