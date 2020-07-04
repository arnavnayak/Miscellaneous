/*
 * This is for understanding how imperative style of coding 
 * and declarative style of coding are different
 * Example is of calculation sum of numbers starting from 0 to 100*/
package com.udemy.javaeight;

import java.util.stream.IntStream;

public class ImperativeDeclarative {

	public static void main(String[] args) {
		
	/*
	 * Imperative style of coding is the one we follow in java 7
	 * demonstrate - how style of programming?*/
		int sum = 0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
			
		}
		System.out.println("Sum off numbers from 0 t 100 in Imperative way : "+sum);
		
		
	/*
	 * Declarative style of coding is the one we follow in java 8
	 * demonstrates what style of programming*/
		
		System.out.println("Sum off numbers from 0 to 100 in Declarative way : "+IntStream.rangeClosed(0, 100).sum());
		
		
	/*rangeClosed performs internal iteration where as above we perform external iterations using for and 
	 *in imperative we define  sum variable tht is mutable which is not the case in declarative and mutable are a problem in multi-threading.
	 *Also in declarative we dont have to worry how the Sum method is working we just knw there is a [redefined method and we use it.
	 *To make DEclarative as thread implmentation we need to just add .parallel method while for Imperative we need to make it thread safe then initialize the thread*/

	}

}
