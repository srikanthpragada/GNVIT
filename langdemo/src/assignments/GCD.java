package assignments;

public class GCD {

	public static int gcd(int a, int b) {
		int smallest = a < b ? a : b;

		if (a % smallest == 0 && b % smallest == 0)
			return smallest;

		for (int i = smallest / 2; i > 1; i--)
			if (a % i == 0 && b % i == 0)
				return i;

		return 1;
	}

	public static void main(String[] args) {

		System.out.println(gcd(9, 8));
		System.out.println(gcd(10, 20));
		System.out.println(gcd(10, 15));
		System.out.println(gcd(10, 10));
	}

}
