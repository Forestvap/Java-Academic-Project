

import java.util.Scanner;

public class Amortization2
{	 public static void main(String[] args){
	double payment, iy;
	int n;
	Scanner scan = new Scanner(System.in);
	System.out.print ("Enter amount of loan: ");
	payment=scan.nextDouble();
	System.out.print("Enter interest rate per year: ");
	iy=scan.nextDouble();
	System.out.print("Enter number of years: ");
	n=scan.nextInt();
	calAmort(payment,iy,n);
}

public static void calAmort(double payment, double iy, int ny){
	double newbal;
	double im = (iy/12)/100;
	int nm=ny*12;
	double mp,ip,pp;
	int i;
	int y;
	mp=payment*im*Math.pow(1+im,(double)nm)/(Math.pow(1+im,(double)nm)-1);
	printHeader();
	for (y=1;y<=ny;y++)
		
	{for (i=1;i<12;i++){
		ip=payment*im; //interest paid
		pp = mp-ip; //Principal paid
		newbal=payment-pp; //new balance
		printSch(y,i,payment,mp,ip,pp,newbal);
		payment=newbal; //update old balance
		
	}
//last month
	pp=payment;
	ip=payment*im;
	mp = pp +ip;
	newbal=0.0;
	printSch(y,i,payment,mp,ip,pp,newbal);
	}
}
public static void printSch(int y, int i, double payment, double mp, double ip, double pp, double newbal)
{
	System.out.format("%-8d%-8d%-12.3f%-10.3f%-10.3f%-10.3f%-12.3f\n",y,i,payment,mp,ip,pp,newbal);
}
  public static void printHeader(){
	  int i;
	  System.out.println("\nAmortization Schedule");
	  for (i=0;i<62;i++)
		  System.out.print("_");
	  System.out.format("\n%-8s%-8s%-12s%-10s%-10s%-10s%-12s"," "," ","Old","Monthly","Interest","Principle","New","Balance");
	  System.out.format("\n%-8s%-8s%-12s%-10s%-10s%-10s%-12s\n\n","Year","Month","Balance","Payment","Paid","Paid","Balance");
  }
}