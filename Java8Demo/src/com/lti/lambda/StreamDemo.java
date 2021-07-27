
	
	
	package com.lti.lambda;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

	class Employees
	{

		int empId;
		String empName;
		double empSalary;
		public Employees(int empId, String empName, double empSalary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		@Override
		public String toString() {
			return "Employees [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
		}
		
		
		
	}

	public class StreamDemo {

		public static void main(String args[])
		{
		
			List<Integer> numbers=new ArrayList<Integer>();
			
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			numbers.add(40);
			numbers.add(50);
			numbers.add(60);
			numbers.add(60);
			numbers.add(10);
			numbers.add(20);
			numbers.add(40);
			numbers.add(50);
//			
//			Iterator<Integer> iterator=numbers.iterator();
//			while(iterator.hasNext())
//			{
//				System.out.println(iterator.next());
//			}
			
			numbers
			.stream()
			.filter(num->num>=30)
			.forEach(num->System.out.println(num));
			
			System.out.println("---------------------------------------------------------");
			
			
			// like a pipeline. Output will change w.r.t the order
			numbers
			.stream()
			.distinct()
			.filter(num->num>=30)
			.forEach(num->System.out.println(num));
			
			System.out.println("--------------------------------------------------------------");
			
			System.out.println(numbers.stream().filter(num->num>=30).count());
			
			List<Employees> employees=new ArrayList<Employees>();
			
			employees.add(new Employees(101,"John",3000.0));
			employees.add(new Employees(102,"Hunter",4000.0));
			employees.add(new Employees(103,"Rock",6000.0));
			employees.add(new Employees(104,"Steve",8000.0));
			employees.add(new Employees(105,"Shawn",5002.0));
			
			employees.stream()
			.filter(e->e.empSalary>=3000)
			//.forEach(System.out::println); // if we simply print , it will give hashcode
			
			.forEach(e->System.out.println(e.getEmpId()+"  "+e.getEmpName()+"  "+e.getEmpSalary()));
			
			
			System.out.println("----------------------------------------------------------");
			
			employees.stream()
			.map(emp->emp.getEmpName())
			.sorted()
			.forEach(System.out::println);
			
			
	System.out.println("----------------------------------------------------------");
			
			employees.stream()
			.map(emp->emp.getEmpName().toUpperCase())
			.sorted()
			.forEach(System.out::println);
			
System.out.println("----------------------------------------------------------");
			List<String> employeeName=employees.stream()
			.map(emp->emp.getEmpName().toUpperCase())
			.sorted()
			.collect(Collectors.toList());
			
			System.out.println(employeeName);
			
			
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	


