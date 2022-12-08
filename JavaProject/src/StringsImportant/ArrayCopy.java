package StringsImportant;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		String[] s = { "hgafd", "avshfd" };
		String[] ss = { "svadhs", "jdgsjgf", "jhadghfgds" };
		int len1 = s.length;
		int len2 = ss.length;
		int ll = len1 + len2;
		String[] sss = new String[ll];
		int len3 = sss.length;
		System.arraycopy(s, 0, sss, 0, len1);
		System.arraycopy(ss, 0, sss, len1, len2);

		System.out.println(Arrays.toString(sss));
		Arrays.sort(sss);
		System.out.println(Arrays.toString(sss));
		System.out.println("===================================");
		int[] arrayA = { 31, 14, 5, 12, 50, 80, 100, 29, 58, 57 };
		int[] arrayB = { 9, 13, 156, 78, 36, 46, 86, 98, 63, 2 };
		int[] arrayC = new int[arrayA.length + arrayB.length];
		System.arraycopy(arrayA, 0, arrayC, 0, arrayA.length);
		System.arraycopy(arrayB, 0, arrayC, arrayA.length, arrayB.length);
		System.out.println(Arrays.toString(arrayC));
		Arrays.sort(arrayC);
		System.out.println(Arrays.toString(arrayC));
	}
}
