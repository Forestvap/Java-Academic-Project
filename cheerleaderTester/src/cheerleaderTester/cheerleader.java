package cheerleaderTester;


public class cheerleader {
	
public static void main (String[] args){
	int a =2, b=1;
	chearleader(a,b);
	int c = 4, d=3;
	chearleader(a,b);
	int e=2, f=4;
	chearleader(a,b);}

public static void chearleader(int lines, int cheers)
{ 
	for (int i =1;i<lines; i++)
	{
	for (int space =lines; space <= i; space ++)
		
		System.out.print("   ");
	for (int n=cheers; n>=i; cheers--)
	System.out.print("Go");

	
	System.out.println();
	}
	
	
}
}
