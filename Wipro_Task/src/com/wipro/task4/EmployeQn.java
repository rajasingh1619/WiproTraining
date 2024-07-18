package com.wipro.task4;

public class EmployeQn {
    private int id;
    private String name;
    private double salary;

    public EmployeQn(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        double increase = salary * (percent / 100);
        salary += increase;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + name + ",salary=" + salary + "]";
    }
}

