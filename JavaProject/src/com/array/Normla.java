package com.array;

public class Normla {
public static void main(String[] args) {
	int [] a=new int [9];
	int [] a1=new int ['a'];
//	int [] a2=new int [-9];
	int  a3 []=new int [] {1,2,3,3,3,4,4};
	int  a4 []={1,2,3,3,3,4,4};
	int a5=10;
	int a6[]=new int[10];
	a6[0]=1;
	a6[1]=2;
	a6[2]=3;
//	a6[3]=6;
	
	int  a8 []={1,2,3,3,3,4,'s'};
	String  a7 []={"asd","ad","fdg"};
	
	System.out.println(a7[0]);
	System.out.println(a7[1]);
	System.out.println(a7[2]);
	
	System.out.println(a7.length);
	
	for (int i = 0; i < a7.length; i++) {
		System.out.println(a7[i]);
	}
	int [][] b= {{234,456},{1234,87654}};
	b[0][0]=1;
	b[0][1]=3;
	b[1][0]=5;
	b[1][1]=1;
	b[1][2]=8;
	
	
}
}
