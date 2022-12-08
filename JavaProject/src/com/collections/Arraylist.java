package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
	public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        System.out.println(Arrays.toString(strArr));
        for(String str:strArr){
            System.out.println(str);
        }
    }
}
