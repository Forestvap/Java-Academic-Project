
import java.util.Scanner;
import java.text.DecimalFormat;

public class LoanCalculator {

	public static void main(String[] args) {

		int Term, n, month=0;
		double Principal, monthlyPayment, APR, i, YInt=0, YPrin=0 ;
		double MInt=0;
		double MPrin=0;
		
		Scanner scan = new Scanner(System.in);
	
		DecimalFormat fmt = new DecimalFormat("#00.#####");
		
		System.out.print ("This program computes monthly loan payments.");

		System.out.print("Principal(loan amount): ");
		Principal = scan.nextDouble();
		System.out.print("Loan Term (in years): ");
		Term = scan.nextInt();
		System.out.print("APR (e.g. 0.04): ");
		APR = scan.nextDouble();
		i = APR / 12;
		n = Term * 12;
	
		
		monthlyPayment = ((i * (Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1)) * Principal);
		System.out.println("Monthly Payment: " + fmt.format(monthlyPayment));
		
		System.out.println("PRINCIPAL:" + Principal + "\tRATE:" + APR + "\tTERM:" + Term );
		System.out.println("\tYEAR\tMONTH\tMONTH PAID\tPAID/PRINCIPAL\tPAID/INTEREST");
		System.out.println ("_____________________________________________________________________________");

		for (n=0; n<=3;n++)
		{
			for (month=0; month<12;month++)
				
		for (int i=0;i<12;i++){
			MInt = (Principal - Mint)*APR/12;
			Mprin=Mprin+MonthlyPayment-Mint;
		}
		System.out.println(Mint + " " + Mprin);
		
		YPrin=MPrin;
		YInt=MInt;
		
	
		System.out.println("\t"+ n + "\t" + month + "\t" + fmt.format(monthlyPayment) +"\t" + MPrin +"\t"+ MInt);
		
		System.out.println("YEAR PRINCIPAL:"+ YPrin );
		System.out.println("YEAR interest:"+ YInt );
			}
	
		

		
		
	
		
		


	
		
	
		}

				
				
		
			
			}
		
	


