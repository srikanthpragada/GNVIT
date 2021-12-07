package basics;

public class Factors2 {
	public static void main(String[] args) {
		if (args.length == 0)
		{
			System.out.println("Sorry! Number is missing!");
			// return;
		    System.exit(1); // terminate with exit code 1
		}
		
		int num = Integer.parseInt(args[0]);// string to int 

		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				System.out.println(i);

	}

}
