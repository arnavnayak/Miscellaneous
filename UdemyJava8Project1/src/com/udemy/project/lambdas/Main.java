package com.udemy.project.lambdas;

import java.util.List;
import java.util.function.Consumer;

import com.udemy.project.data.Student;
import com.udemy.project.data.StudentDataBase;

public class Main {
	static List<Student> studentList=StudentDataBase.getAllStudents();
	static Consumer<Student> studentConsumerName=(student)->System.out.println(student.getName());
	static Consumer<Student> studentConsumerActivites=(student)->System.out.println(student.getActivities());
	static Consumer<Student> studentConsumerGender=(student)->System.out.println(student.getGender());
	static Consumer<Student> studentConsumer=(student)->System.out.println(student.getName());

	public static void printName() {
		
		//To do -- to get hold of the data base and print all the students present
		
		//pre java 8 way:---
		for(Student student:studentList) {		//enhanced for loop
			System.out.println(student.getName());
		}
		
		//post java 8 way:---
		System.out.println("Java 8 way of printing student names:----");
		studentList.forEach(studentConsumer);	//for iterating the above method and printing individual names
	}
	public static void printNameAndActivityAndGender() {
		
		studentList.forEach(studentConsumerName.andThen(studentConsumerActivites).andThen(studentConsumerGender)); //Consumer chaining and us eof and then
	}
	public static void printNameAndActivityIfGenderIsMale() {
		studentList.forEach((student->{
			if(student.getGender().equals("male")) {
			studentConsumerName.andThen(studentConsumerActivites).accept(student);
			}
			
		}));
	}

	
	public static void main(String[] args) {
		/*
		 * Consumer<String> consumer1=(s)->System.out.println(s.toUpperCase());
		 * consumer1.accept("neil");
		 */
		//printName();
		//printNameAndActivityAndGender();
		printNameAndActivityIfGenderIsMale();
	}

}
