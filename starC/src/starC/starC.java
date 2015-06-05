package starC;

public class starC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int Max_row = 10;

for (int row = 1; row <= Max_row; row++) {
	
	for (int space = 1; space <= row-1; space++)
		System.out.print(" ");
	
	for (int star = 10; star >= row; star--)
		System.out.print("*");
	

	System.out.println();
	}

}
}