package org.student;

import org.department.Department;

public class Student extends Department {
	public  void studentName() {
		System.out.println("student name :Ram");
      }
	public  void studentDept() {
		System.out.println("department name :Mathematics");
      }
	public  void studentId() {
		System.out.println("student Id :1543678");
      }
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.depName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
