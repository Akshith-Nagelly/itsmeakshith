package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.lti.model.Course;
import com.lti.model.Student;

public class InMemooryStudentDaoImpl implements StudentDao {

	static List<Student> students = new ArrayList<Student>();
	static Set<Course> courses=new HashSet<Course>();
	static Map<Student,Course> enrollments=new HashMap<>();
	public  InMemooryStudentDaoImpl() {
		students.add(new Student(1,"ak",LocalDate.of(2000, 12, 12)));
		students.add(new Student(1,"ak",LocalDate.of(2000, 11, 11)));
		students.add(new Student(1,"mk",LocalDate.of(2000, 10, 10)));
		students.add(new Student(1,"ak",LocalDate.of(2000, 9, 9)));
		students.add(new Student(1,"ak",LocalDate.of(2000, 8, 8)));
		
		
		courses.add(new Course(101,"java",4,3000));
		courses.add(new Course(102,"python",3,2500));
		courses.add(new Course(103,"C",2,2000));
	}
	
		public Course findACourse(int courseId) {
			for(Course course:courses)
				if(course.getId()==courseId) {
				return course;
				}
				return null;
				}
	
	
	@Override
	public boolean addStudent(Student student) {
		return students.add(student);

	}
     
	@Override
	public void updateStudent(Student student) {

		Student existingStudent = findAStudent(student.getId());

		if (existingStudent != null) {
			int position = students.indexOf(existingStudent);
			students.set(position, student);
			System.out.println("student updated succesfully");
		} else {
			System.out.println("student not found");
		}

	}

	@Override
	public void removeStudent(int id) {
		Student existingStudent = findAStudent(id);

		if (existingStudent != null) {
			int position = students.indexOf(existingStudent);
			students.remove(position);
			System.out.println("student unregistered");
		} else {
			System.out.println("student not found");
		}

	}

	@Override
	public Student findAStudent(int id) {
		for (Student st : students) {
			if (st.getId() == id) {
				return st;
			}
		}

		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	

	@Override
	public void enroll(int studentId, int courseId) {
		Student student=findAStudent(studentId);
		Course course=findACourse(courseId);
		if(student==null || course==null) {
			System.out.println("either student or course not found");
		}
		else {
			enrollments.put(student, course);
			System.out.println("enrolled succesfully");
			
		}
		
		
	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		// TODO Auto-generated method stub
		return null;
	}
	
    
	

}
