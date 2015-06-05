import java.util.Scanner;
import java.awt.Point;

public class Distance {
private int pointX;
private int pointY;
public Distance (int x, int y)

{
	pointX=x;
	pointY =y;
}
public int getX()
{
	return pointX;
}
public int getY()
{
	return pointY;
}
public double getDistance (Distance otherPoint)

{
	int x= pointX - otherPoint.pointX;
	x= x*x;
	int y = pointY- otherPoint.pointY;
	y=y*y;
	double distance= Math.sqrt(x+y);
	return distance;
}
public static void main(String[]args)
{
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Enter the coordiantes for point 1: (x and y)");
	int pointX=scan.nextInt();
	int pointY = scan.nextInt();
	
	Distance pointp1 = new Distance (pointX, pointY);
	System.out.print("Enter the coordiantes for point 2: (x and y)");
	int pointX2= scan.nextInt();
	int pointY2= scan.nextInt();
	Distance pointp2 = new Distance(pointX2, pointY2);
	System.out.println("The Distance between the two points is: " + pointp1.getDistance(pointp2));
	
}
}

