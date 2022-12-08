package StringsImportant;

public class Problem3_java {
	public static void main(String[] args) {
		int[] a = { 0, 1, 5, 8, 14, 18, 44, 81, 89, 99, 102 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 10 && a[i] <= 20) {
				count++;
			}
		}
		System.out.println(count);
	}
}
