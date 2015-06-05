package sales;

import java.util.Scanner;


public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int SALESPEOPLE; 
		int sum;
		int i;
		int average=0, value;
		int MaxSalesPerson = 0, MinSalesPerson = 0;
		int MaxSale = 0;
		int MinSale = 100000;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of sales people: ");
		SALESPEOPLE=scan.nextInt();
		int[] sales = new int[SALESPEOPLE];

		for (i = 0; i < sales.length; i++) {
			System.out.print("Enter sales for salesperson " + (i + 1)+ ": ");

			sales[i] = scan.nextInt();
			if (sales[i] > MaxSale) {
				MaxSale = sales[i];
				MaxSalesPerson = i+1;
			}
			if (sales[i] < MinSale) {
				MinSale = sales[i];
				MinSalesPerson = i+1;
			}

		}

		System.out.println("\nSalesperson Sales");
		System.out.println("-------------------");
		sum = 0;
		for (i = 0; i < sales.length; i++) {
			System.out.println("    " + i + "       " + sales[i]);
			sum += sales[i];
		
		}

		System.out.println("\nTotal sales: " + sum);
		average = (sum / i);
		System.out.println("The average sale is " + average + ".");
	
		System.out.println("SalesPerson " + MaxSalesPerson + " had the highest sale with " + MaxSale + ".");
		System.out.println("SalesPerson " + MinSalesPerson + " had the lowest sale with " + MinSale + ".");
		
System.out.println ("Please enter a vlaue: ");
value = scan.nextInt();
int salesCount = 0;

for (i=0; i<sales.length;i++)
{if (sales[i] > value)
{System.out.println("Salesperson " + (i+1) + " has sold " + sales[i] + ".");salesCount++;
System.out.println ("The ID of salespeople whose sales exceeded " + value + " is " + (i+1) + ".");
	}

	
}
System.out.println("The total number of salespeople who exceeded the required value are " + salesCount + ".");
	}

}
