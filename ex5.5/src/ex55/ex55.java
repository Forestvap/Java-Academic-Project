package ex55;

import java.util.Scanner;

public class ex55 {

	public static void main(String[] args) {
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer value: ");
		value = scan.nextInt();
		while (value <= 0) {
			System.out.println("The number is not positive integer.");
			System.out.print("Enter a positive interger value: ");
			value = scan.nextInt();}
			System.out.print(value + " is a positive interger value.");
			
		}
	}


