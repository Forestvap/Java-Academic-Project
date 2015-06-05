package loadC;
import java.util.Scanner;
import java.text.DecimalFormat;
public class loadC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		for (n=1; n<=3;n++)
		{
			for (month=0; month<12;month++)
				
		for (int a=1;a<=12;a++){
			MInt = (Principal - MInt)*APR/12;
			MPrin=MPrin+monthlyPayment-MInt;
		}
		System.out.println(MInt + " " + MPrin);
		
		YPrin=MPrin;
		YInt=MInt;
		
	
		System.out.println("\t"+ n + "\t" + month + "\t" + fmt.format(monthlyPayment) +"\t" + fmt.format(MPrin) +"\t"+ fmt.format(MInt));
		
		System.out.println("YEAR PRINCIPAL:"+ YPrin );
		System.out.println("YEAR interest:"+ YInt );
			}
	
		

		
		
	
		
		


	
		
	
		}
	}


