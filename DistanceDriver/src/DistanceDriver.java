
public class DistanceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x1=1, y1=0, x2=4, y2=4;


sentence(x1,y1,x2,y2);
int x11=10, y11= 1, x22= 2, y22=3 ;
sentence(x11,y11,x22,y22);
	}
	public static void sentence (int x1, int y1, int x2, int y2){
double answer=Math.sqrt( Math.pow(x2-x1, 2)+ Math.pow(y2-y1,2));
System.out.println("distance (" + x1 + "," + y1 + "," + x2 + "," + y2 +") =" + answer);

	}

}
