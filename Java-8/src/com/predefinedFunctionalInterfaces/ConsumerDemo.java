package com.predefinedFunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> con = str -> System.out.println(str);
		con.accept("mahesh");
		
		BiConsumer<String, String> bi=(t1,t2)->System.out.println(t1+" ."+t2);
		bi.accept("mahesh", "Unukuru");

	}
	
}
