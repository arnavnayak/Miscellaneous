package com.udemy.javaeight.functionalinterface;

import java.util.function.Consumer;

public class ConsumerFunctionInterfaceExample {

	public static void main(String[] args) {
		Consumer<String> consumer=(s)->System.out.println(s.toUpperCase());
		consumer.accept("neil");
	}

}
