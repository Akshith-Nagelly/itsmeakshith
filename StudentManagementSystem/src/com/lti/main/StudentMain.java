
package com.lti.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.lti.dao.InMemooryStudentDaoImpl;
import com.lti.dao.StudentDao;
import com.lti.dao.persistantStudentDaoImpl;
import com.lti.model.Course;
import com.lti.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		//StudentDao studentDao=new InMemooryStudentDaoImpl();
		StudentDao studentDao=new persistantStudentDaoImpl();
		Scanner sc = new Scanner(System.in);
		boolean flag=true;

		do {
			System.out.println(
					"1.Add a student.\n2.Update a student.\n3.Remove a student.\n4.Search a student.\n5.View all students."+"\n6.Enroll\n7.view All"
							+ " Enrollments");
			int ch = sc.nextInt();
			int id;
			String name;
			String date;
			DateTimeFormatter formatter;
			LocalDate dateOfBirth;
			Student student;

			switch (ch) {
			
			case 1:
				//System.out.println("Enter your id,name, date of birth(YYYY/MM/DD) ");
				// id = sc.nextInt();
				System.out.println("Enter your name, date of birth(YYYY/MM/DD) ");
				 name = sc.next();
				 date = sc.next();
				 formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				 dateOfBirth = LocalDate.parse(date, formatter);
				
				// student=new Student(id,name,dateOfBirth);
				 student=new Student();
				 student.setName(name);
				 student.setDateOfBirth(dateOfBirth);
				 
				boolean result=studentDao.addStudent(student);
				if(result) {
					System.out.println("congrats your registration confirmed");
				}
				else {
					System.out.println("sorry registration failed");
				}
				
				break;
			case 2:
				System.out.println("Enter your id,name, date of birth(YYYY/MM/DD) ");
				 //id = sc.nextInt();
				//System.out.println("Enter name, date of birth(YYYY/MM/DD) ");
				  id=sc.nextInt();
				 name = sc.next();
				 date = sc.next();
				 formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				 dateOfBirth = LocalDate.parse(date, formatter);
				
				student=new Student(id,name,dateOfBirth);
				studentDao.updateStudent(student);
				break;
			case 3:
				System.out.println("enter student id");
				id=sc.nextInt();
				studentDao.removeStudent(id);
				break;
			case 4:
				System.out.println("enter student id");
				id=sc.nextInt();
				student=studentDao.findAStudent(id);
				if(student!=null) {
					System.out.println(student.getId()+" "+student.getName()+" "+student.getDateOfBirth());	
				}
				else {
					System.out.println("student not found");
				}
				break;
			case 5:
				
				   List<Student> students=studentDao.viewAllStudents();
				   if(students.isEmpty()) {
					   System.out.println("no student found");
				   }
				   else {
					   for(Student st:students) {
						   System.out.println(st.getId()+" "+st.getName()+" "+st.getDateOfBirth());
					   
				   }
				   
				   }
				
				break;
				
			case 6:
				
				System.out.println("enter student id and course id");
				int studentId=sc.nextInt();
				int courseId=sc.nextInt();
				studentDao.enroll(studentId, courseId);
				break;
			case 7:
				Set<Entry<Student,Course>> enrollments=studentDao.viewEnrollments();
				Iterator<Entry<Student,Course>> allEnrollments=enrollments.iterator();
				while(allEnrollments.hasNext()) {
					Entry<Student, Course> enrollment=allEnrollments.next();
					Student st=enrollment.getKey();
					Course cs=enrollment.getValue();
					System.out.println(st.getId()+" "+st.getDateOfBirth()+" "+cs.getId()+" "+cs.getName());
				}
				
			default:
				flag=false;
				break;

			}

		} while (flag);
	}

}