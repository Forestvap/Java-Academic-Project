package range;


public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum = 0;
		int minNum = 0;
		int range;
		int n=0;
		int[] arrayNums = { 36, 12, 25, 19, 46, 31, 22 };
		System.out.print("Array: ");
		for (int array : arrayNums)

			System.out.print(array + ",");

		for (int i = 0; i < arrayNums.length; i++) {
			if ( arrayNums[n] > arrayNums[i + 1])
			 {n++;
				maxNum = arrayNums[i+1];
			
			}
			}
		for (int i = 0; i < arrayNums.length; i++) {
			if (arrayNums[n] < arrayNums[i + 1])
				{ n++;

				minNum = arrayNums[i+1];
				}	
			}
		range = (maxNum - minNum + 1);
		System.out.println("Range is : ");
	}

}
