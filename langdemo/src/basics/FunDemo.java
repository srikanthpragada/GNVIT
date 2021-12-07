package basics;

public class FunDemo {

	public static void wish(String message, String... names) {
		for (String name : names)
			System.out.println(message + " " + name);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(25));
		wish("Hi", "James", "Anders", "Dennis");
		wish("Hello", "Li", "Lee");

	}

}
