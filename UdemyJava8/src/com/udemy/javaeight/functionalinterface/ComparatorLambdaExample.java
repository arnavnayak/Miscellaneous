package com.udemy.javaeight.functionalinterface;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

	/*
	 * prior java 8 
	 */
	Comparator<Integer> comparator=new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2); 	// if o1==o2 returns --> 0
										// if o1>o2 returns --> 1
										// if 01<02 returns --> -1
		}
	};
		System.out.println("REsult of the comparator is : "+comparator.compare(4, 4));
		System.out.println("REsult of the comparator is : "+comparator.compare(5, 4));
		System.out.println("REsult of the comparator is : "+comparator.compare(3, 4));
		
	/*
	 * post java 8    three ways to implement lamb:---
	 */
	Comparator<Integer> copmaratorLambda1=(Integer o1,Integer o2)->{return o1.compareTo(o2);};
	Comparator<Integer> copmaratorLambda2=(Integer o1,Integer o2)->o1.compareTo(o2);
	Comparator<Integer> copmaratorLambda3=(o1,o2)->o1.compareTo(o2);
	
	System.out.println("Three ways to impleent lambda:-----------");
	System.out.println("REsult of the comparatorLambda1 is : "+copmaratorLambda1.compare(4, 4));
	System.out.println("REsult of the comparatorLambda2 is : "+copmaratorLambda2.compare(4, 4));
	System.out.println("REsult of the comparatorLambda3 is : "+copmaratorLambda3.compare(4, 4));
	}

}
