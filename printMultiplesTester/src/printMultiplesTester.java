// Q9 of final exam by Yuan Tao 
public class printMultiplesTester {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		int a=3, b=5;


		printMultiples(a,b);
		int c = 7, d=3;
		printMultiples(c,d);

		}
		public static void printMultiples(int n, int m)
		{
		
				
		System.out.println("The first " + m + " multiples of " + n + " are " );
			int result;
			for (int i = 1; i<=m; i++)
			{result = n*i;
			System.out.print(result + ",");}
		
		
		
		}
	
}

