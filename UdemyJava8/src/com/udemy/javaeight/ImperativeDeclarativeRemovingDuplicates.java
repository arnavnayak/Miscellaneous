package com.udemy.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*This is a program to show the differenece between imperative style and 
 * Declarative style of code.
 * Program- to remove the duplicates from a list of integer*/
public class ImperativeDeclarativeRemovingDuplicates {

	public static void main(String arge[]) {
		
		//Imperative style
		List<Integer> integerList= Arrays.asList(1,2,3,1,2,3);
		List<Integer> uniqueIntegerList=new ArrayList<>();
		for(Integer integer: integerList) {
			if(!(uniqueIntegerList.contains(integer))) {
				uniqueIntegerList.add(integer);
			}
		}
		System.out.println("Imperative way of removing duplicate integer: "+uniqueIntegerList);
		
		//Declarative style
		System.out.println("Declarative way of removing duplcate integers: "+integerList.stream().distinct().collect(Collectors.toList()));
	/*
	 * here we are using stream for streaming through the integer list 
	 * distinct to identify the non duplicate elements of the list and 
	 * collecting it using collect and toList for collecting the elements as list.
	 */
	
	}
}
