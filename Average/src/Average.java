

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Args;
		int i = 0;
		
		if (args.length > 0) {
			try {
				Args = Integer.parseInt(args[i]);
				for (i = 0; i < args.length; i++)
					System.out.println(args[i]);
				int sum = 0;
				double average = 0.0;
				for (String el:args)
				{sum +=Integer.parseInt(el);
				average = sum/(double)args.length;
				}

				System.out.println("Average is " + average);
				}
		

			catch (NumberFormatException e) {
				System.err.println("Argument must be an integer");
				System.exit(1);
			}
		}
		else System.out.println("No arguments");

	}
}
