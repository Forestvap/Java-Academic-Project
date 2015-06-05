package starB;

public class starB {

	public static void main(String[] args) {

		final int Max_row = 10;

		for (int row = 1; row <= Max_row; row++) {
			for (int space = 9; space >= row; space--)
				System.out.print(" ");

			for (int star = 1; star <= row; star++)
				System.out.print("*");
			System.out.println();
		}
	}
}