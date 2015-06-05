package ex69;
import java.util.Scanner;
public class ex69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; 
		String name;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your character: ");
		name=scan.nextLine();
		for (int index = 0; index < name.length(); index++) 
		 if (name.charAt(index) == 'a') 
		 count++; 
		System.out.println ("The character 'a' appears in your word " + count + " time(s)."); 


	}

}
