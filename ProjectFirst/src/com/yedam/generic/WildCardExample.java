package com.yedam.generic;

import java.util.Arrays;

//<T>
// <?> , <? extends class> , <? super class>
// Person -> Worker
//        -> Student -> HighStudent
// Course<T>
public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		//Course<Person>, Course<Worker>, Course<Student>, Course<HighStudent>
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
		//[1,2,3]  >> [1,2,3]
	}       
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인 과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));

		Course<Worker> courseWorker = new Course<Worker>("직장인과정", 5);
		courseWorker.add(new Worker("직장인"));

		Course<Student> courseStudent = new Course<Student>("학생과정", 5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등학생"));

		Course<HighStudent> courseHigh = new Course<HighStudent>("고등학생", 5);
		courseHigh.add(new HighStudent("고등학생"));
		
		//Course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);
		
		//Course<? extends class>
		registerStudent(courseStudent);
		registerStudent(courseHigh);
		
		
		//Course<? super class>
		registerWorker(coursePerson);
		registerWorker(courseWorker);
	}
}
