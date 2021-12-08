package assignments;

public class ArraySearch {

	public static int search(int[] a, int value) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == value)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 10, 30, 20, 50 };
		int[] b = { 10, 20, 30 };

		System.out.println(search(a, 10));
		System.out.println(search(a, 15));
		System.out.println(search(b, 30));

	}

}
