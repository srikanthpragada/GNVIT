package assignments;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Number : ");
			a[i] = s.nextInt();
		}

		// Even numbers
		for (int n : a)
			if (n % 2 == 0)
				System.out.println(n);

		// Odd numbers
		for (int n : a)
			if (n % 2 != 0)
				System.out.println(n);

	}

}
