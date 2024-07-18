package com.wipro.task3;



public class TeacherTesterQn {
 public static void main(String[] args) {

     Teacher teacher1 = new Teacher("Raja Kr Singh", "Math", 50000.0);
     Teacher teacher2 = new Teacher("Deepak Kumar", "English", 60000.0);
     Teacher teacher3 = new Teacher("Bikash Mondal", "Science", 70000.0);
     Teacher teacher4 = new Teacher("Rabindra Yadav", "History", 40000.0);

     Teacher[] teachers = new Teacher[] {teacher1, teacher2, teacher3, teacher4};
     for (Teacher teacher : teachers) {
         System.out.println(teacher.toString());
     }
 }
}
class Teacher{
	 private String teacherName;
	 private String subject;
	 private double salary;

	 public Teacher(String teacherName, String subject, double salary) {
	     this.teacherName = teacherName;
	     this.subject = subject;
	     this.salary = salary;
	 }

	 public String getTeacherName() {
	     return teacherName;
	 }

	 public String getSubject() {
	     return subject;
	 }

	 public double getSalary() {
	     return salary;
	 }

	 @Override
	 public String toString() {
	     return "Name : " + teacherName + ", Subject : " + subject + ", Salary : " + salary;
	 }
	}

