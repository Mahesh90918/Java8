package com.imp;

public class find {
public static void main(String[] args) {
	int [] a= {0,2,4,1,3};
	System.out.println(a[3]);
//	System.out.println(a.length);//5
//	System.out.println(3%5);//3
	for (int i = 0; i < a.length; i++) {
		a[i]=a[(a[i]+3)%a.length];// a[(3)%5]=a[3]=1
		//a[1]=a[0]=value is 1
	}
	System.out.println(a[1]);
}
}
