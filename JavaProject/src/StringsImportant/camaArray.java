package StringsImportant;

public class camaArray {
	public static void main(String[] args) {
		int p[] = { 1, 2, 2, 3, 4, 5, 6 };
		// System.out.println(p.length);
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]);
			if (i != p.length -1) {
				System.out.print(",");
			}
		}
	}
}
