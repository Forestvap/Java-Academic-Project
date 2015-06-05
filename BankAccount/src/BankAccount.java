
public class BankAccount {
private double balance;
private String name;
private long acctNum;
private final double Rate = 0.035; // interest rate of 3.5%
public BankAccount (String owner, long number)
{
	balance = 0.0;
	name = owner;
	acctNum = number;
}

public double withdraw(double amount) {
if (balance >= amount)
	balance -= amount;
	
else 
	System.out.println("Insufficient funds");
return balance;
	}
public double deposit (double amount)
{
balance += amount;
return balance;
}
public double addInterest()
{balance +=(balance*Rate);
return balance;
}
public double getBalance()
{
return balance;	
}
public String getName()
{
	return name;
	}

public String toString()
{
	return ("Name: " + name + "\tAccount Number: " + acctNum + "\tBalance: " + balance);
}
public double chargeFee ()
{
this.balance -= 10;
return balance;	
}

public void changeName (String newName)
{
name = newName;
}
}
