
package com.lti.main;

import java.util.Iterator;
import java.util.List;

import com.lti.model.Course;
import com.lti.model.Student;

public class Info {

	public static void display(Student student) {
		// System.out.println(student.getId()+ " " + student.getName()+"
		// "+student.getDateOfBirth()+" " +student.getCollegeName());
		System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth() + " "
				+ student.getCollegeName());
		// +" "+Arrays.toString(student.getPhoneNumbers())
	}

	public static void display(Student[] students) {
		/*
		 * for(int i=0; i< students.length; i++) { display(students[i]); }
		 */
		for (Student st : students) {
			display(st);
		}
	}

	public static void display(List<Student> students) {
		/*
		 * for(Student st:students) { display(st); }
		 */
		Iterator<Student> studs = students.iterator();
		while (studs.hasNext()) {
			Student st = studs.next();
			display(st);
		}
	}

	// -----Course Related display methods----
	//public static void display(Course course) {
		//System.out
			//	.println(course.getId() + " " + course.getName() + " " + course.getDuration() + " " + course.getFees());
	//}

	//public static void display(Course[] courses) {
		//for (Course cr : courses) {
			//display(cr);
		//}
	//}

	//public static void display1(List<Course> courses) {
		/*
		 * for(Student st:students) { display(st); }
		 */
		//Iterator<Course> cs = courses.iterator();
		//while (cs.hasNext()) {
			//Course cr = cs.next();
			//display(cr);
		//}
	public static void displayCourse(Course course) {
		course.caluclateMonthlyFee();
	
	}
}

