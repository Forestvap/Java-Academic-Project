package starD;

public class starD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Max_row = 10;

		for (int row = 1; row <= Max_row / 2; row++) {

			for (int space = 4; space >= row ; space--)
				System.out.print(" ");	
			
			for (int star = 1; star <= (row * 2) - 1; star++)
				System.out.print("*");
			
	

			System.out.println();
		}
			for (int row = 1; row <= Max_row / 2; row++) 
			{
				for (int space = 1; space <= row - 1; space++)
					System.out.print(" ");
				for (int star = 1; star <= Max_row - (row * 2) + 1; star++)
					System.out.print("*");
				System.out.println();
			}

		}

	}


