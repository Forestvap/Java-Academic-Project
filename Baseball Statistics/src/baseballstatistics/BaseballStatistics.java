package baseballstatistics;
import java.util.Scanner;
import java.io.*;

public class BaseballStatistics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner fileScan, lineScan;
String fileName;
int outs = 0, hits = 0, walks =0, sac = 0;

Scanner scan = new Scanner(System.in);
System.out.print("Enter the name of the input file:"   );
fileName = scan.nextLine();
fileScan = new Scanner(new File(fileName));

while (fileScan.hasNext())
{	fileName=fileScan.nextLine();
	
	lineScan = new Scanner (fileName);
	
	lineScan.useDelimiter(",");
	
	while (lineScan.hasNext())
	
	{	
	System.out.println(" " + lineScan.next());
	String input = lineScan.nextLine();
	int point = (input.indexOf(","));
	String name = input.substring(0,point);
	
	String records = input.substring(point,input.length());
	
	for (int i =0;i < records.length();i++)
	{	
	if(records.charAt(i) == 'o')
	{outs++;}
	else if (records.charAt(i) == 'h')
	{hits++;}
	else if (records.charAt(i) == 'w')
	{walks++;}
	else if (records.charAt(i) == 's')
	{sac++;}
	
	System.out.println("Hits: " + hits + " Outs: " + outs +
        " Walks: " + walks+ " Sacrafices: " + sac );
	System.out.println();
	}
}
}
	}	

}

