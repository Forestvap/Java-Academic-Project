package stringplay;

public class stringplay {

	public static void main(String[] args) {
	String town = new String ("Anytown, USA");
	
	String college = new String ("PoDunk College");
	int stringLength;
	String change1, change2, change3;
	System.out.println("length of college: " + college.length());
	stringLength = college.length();
	System.out.println(college + " contains " + stringLength + " characters.");
	change1 = college.toUpperCase();
	change2 = change1.replace('O', '*');
	change3 = change2.concat(" ," + town);
	System.out.println("The final string is " + change3 );
	
	
	}

}
