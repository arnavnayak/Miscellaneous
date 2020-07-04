package com.udemy.project.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
	public static List<Student> getAllStudents(){
		/*
		 * 2nd grade students
		 */
		Student student1=new Student("Arnav", 2, 3.6, "male", Arrays.asList("Music","Art","Football"));
		Student student2=new Student("Neil", 2, 3.3, "male", Arrays.asList("Swimming","Dance","Football"));
		/*
		 * 3rd grade students
		 */
		Student student3=new Student("Enigma", 3, 3.6, "male", Arrays.asList("Cricket","Music","Virtual Gaming"));
		Student student4=new Student("Kushina", 3, 3.3, "female", Arrays.asList("Cooking","Dance","Football"));
		/*
		 * 4th grade students
		 */
		Student student5=new Student("Angel", 4, 3.2, "male", Arrays.asList("Poems","Art","Blogging"));
		List<Student> students=Arrays.asList(student1,student2,student3,student4,student5);
		return students;
		
	}
}
