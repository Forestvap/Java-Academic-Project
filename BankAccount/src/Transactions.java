

public class Transactions {

	public static void main (String[] args)
	{
		
		BankAccount acct1 = new BankAccount ("Sally", 1111);
		
		BankAccount acct2 = new BankAccount ("Joe", 2222);
		
		BankAccount acct3 = new BankAccount ("Tom", 3333);
		
		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		System.out.println(acct3.toString());
		
		System.out.println ("Deposite $100 into " + acct1.getName() + "'s Account 1111");
		acct1.deposit(100.00);
		System.out.println("New Balance for " + acct1.getName() + "'s Account 1111: $" + acct1.getBalance());
		System.out.println();
		
		System.out.println("Withdraw $50 from " + acct2.getName() + "'s Account 1111");
		acct2.withdraw(50);
		System.out.println("New Balance for " + acct2.getName() + "'s Account 2222: $"+ acct2.getBalance());
		System.out.println();
		
		acct1.chargeFee();
		acct2.chargeFee();
		System.out.println("Account balance after charge fees:");
		System.out.println(acct1.getName() + "'s Account 1111: $" + acct1.getBalance());
		System.out.println(acct2.getName() + "'s Account 2222: $" + acct2.getBalance());
		System.out.println();
		
		System.out.println("Change name on Account 2222");
		acct2.changeName("Tom");
		System.out.println();
		
		acct1.addInterest (); 
		acct2.addInterest (); 
		acct3.addInterest ();
		
		System.out.println();
		System.out.println("Print bank accounts:");
		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		System.out.println(acct3.toString());
	}
}
