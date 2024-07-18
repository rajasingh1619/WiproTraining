package com.wipro.task3;

 class Employee {
 private int employeeId;
 private String employeeName;

 public Employee(int employeeId, String employeeName) {
     this.employeeId = employeeId;
     this.employeeName = employeeName;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public void setEmployeeId(int employeeId) {
     this.employeeId = employeeId;
 }

 public String getEmployeeName() {
     return employeeName;
 }

 public void setEmployeeName(String employeeName) {
     this.employeeName = employeeName;
 }
}

 class PermanentEmployee extends Employee {
 private double basicPay;
 private double hra;
 private float experience;

 public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
     super(empId, name);
     this.basicPay = basicPay;
     this.hra = hra;
     this.experience = experience;
 }

 public double getBasicPay() {
     return basicPay;
 }

 public void setBasicPay(double basicPay) {
     this.basicPay = basicPay;
 }

 public double getHra() {
     return hra;
 }

 public void setHra(double hra) {
     this.hra = hra;
 }

 public float getExperience() {
     return experience;
 }

 public void setExperience(float experience) {
     this.experience = experience;
 }

 public double calculateMonthlySalary() {
     double variableComponent = 0;
     if (experience < 3) {
         variableComponent = 500;
     } else if (experience >= 3 && experience < 5) {
         variableComponent = 1000;
     } else if (experience >= 5 && experience < 10) {
         variableComponent = 2000;
     } else {
         variableComponent = 3000;
     }
     return basicPay + hra + variableComponent;
 }
}
 class ContractEmployee extends Employee {
 private double wage;
 private float hoursWorked;

 public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
     super(empId, name);
     this.wage = wage;
     this.hoursWorked = hoursWorked;
 }

 public double getWage() {
     return wage;
 }

 public void setWage(double wage) {
     this.wage = wage;
 }

 public float getHoursWorked() {
     return hoursWorked;
 }

 public void setHoursWorked(float hoursWorked) {
     this.hoursWorked = hoursWorked;
 }

 public double calculateSalary() {
     return hoursWorked * wage;
 }
}
public class EmployeeTesterQn {
 public static void main(String[] args) {
     PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Raja Kr Singh", 50000, 10000, 4);
     System.out.println("Employee ID: " + permanentEmployee.getEmployeeId());
     System.out.println("Employee Name: " + permanentEmployee.getEmployeeName());
     System.out.println("Basic Pay: " + permanentEmployee.getBasicPay());
     System.out.println("HRA: " + permanentEmployee.getHra());
     System.out.println("Experience: " + permanentEmployee.getExperience());
     System.out.println("Monthly Salary: " + permanentEmployee.calculateMonthlySalary());

     ContractEmployee contractEmployee = new ContractEmployee(2, "Bikash Mondal", 500, 40);
     System.out.println("Employee ID: " + contractEmployee.getEmployeeId());
     System.out.println("Employee Name: " + contractEmployee.getEmployeeName());
     System.out.println("Wage: " + contractEmployee.getWage());
     System.out.println("Hours Worked: " + contractEmployee.getHoursWorked());
     System.out.println("Salary: " + contractEmployee.calculateSalary());
 }
}