package luckyNumbers;

import java.util.Random;

public class LuckyNumbers {

	public static void main(String[] args) {

		Random generator = new Random();
		int lucky1, lucky2, lucky3;
		lucky1 = Math.abs((generator.nextInt())%30+50);
		lucky2 = generator.nextInt(10)+90;
		lucky3 = (int)(generator.nextFloat()*20+11);
		System.out.println("Your lukcy numbers are " + lucky1 + ", "+lucky2 + ", and "+ lucky3);
		
	}

}
