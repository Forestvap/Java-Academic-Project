import java.util.Scanner;

public class BaseConvert {

	public static void main(String[] args) {
		//
		int base;
		int base10Num;
		int maxNumber;

		int place0;
		int place1;
		int place2;
		int place3;
		int quotient;
		String baseBNum = new String("");

		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.println();
		System.out.print("Please enter a base (2-9): ");
		base = scan.nextInt();
		maxNumber = (int) Math.pow(base, 4) - 1;
		System.out.println("In base " + base
				+ " you want to convert a number must be between 0 and "
				+ maxNumber);
		System.out.print("Please enter a base 10 number to convert: ");
		base10Num = scan.nextInt();
		

		place0 = base10Num % base ;
		quotient = base10Num / base ;
		
		place1 = quotient % base ;
		quotient = quotient / base ;
		
		place2 = quotient % base ;
		quotient = quotient / base ;
		
		place3 = quotient % base ;
		quotient = quotient / base ;
		
		baseBNum = "" + place3 + place2 + place1 + place0 ;
		
		System.out.print("The decimal number:" + base10Num);
		System.out.println(", is equal to the base " + base + " number, "
				+ baseBNum + ".");

	}

}
