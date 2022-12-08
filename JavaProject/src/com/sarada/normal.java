package com.sarada;

public class normal {
	public static void main(String[] args) {
		int x = 10;
		int y = 010;
		int z = 0x10;
		System.out.println(x + "----" + y + "----" + z);// 10----8----16
		int zz = 0xFACE;
		System.out.println(zz);
		System.out.println((int) (0x10));
		
		int yy = 10;
//		System.out.println(yy++);// 10
//		System.out.println(yy);//11
//		System.out.println(++yy);//11
		int a=10;//1010
		int b=-10;
		
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(10<<2);
		// 101000
		
		System.out.println(Math.pow(2, 0));
	

	}
}
