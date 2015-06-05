

package rightTriangle;
import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		double side1, side2;
		double hypotenuse;
		Scanner scan = new Scanner(System.in);
		System.out.print ("Please enter the lengths of the two sides of " + " a right triangle (separate by a blank space): ");
		side1 = scan.nextDouble();
		side2 = scan.nextDouble();
		
		hypotenuse = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
		System.out.println ("Length of the hypotenuse: " + hypotenuse);
		

	}

}
