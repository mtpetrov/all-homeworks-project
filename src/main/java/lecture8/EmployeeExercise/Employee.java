package lecture8.EmployeeExercise;

import java.util.Random;
import java.util.Scanner;

public class Employee {
   private String id;
   private String firstName;
   private String secondName;
    int salaryPerMonth;

    public Employee(String id,String firstName, String secondName, int salaryPerMonth){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salaryPerMonth = salaryPerMonth;
    }


    public int getSalaryPerMonth(){
        return salaryPerMonth;
    }
    public String getName() {
        String name = firstName + " " + secondName;
        //System.out.println("Your name is: " + name);
        return name;
    }

    public int raiseSalary(int percentage) {
        salaryPerMonth = salaryPerMonth + (salaryPerMonth * (percentage / 100));
        return salaryPerMonth;
    }

    public int getAnnualSalary() {
        return salaryPerMonth * 12;
    }
    @Override
    public String toString() {
        return "Employee ID: " + id + "\n"
                + "Name: " + getName() + "\n"
                + "Salary: " + salaryPerMonth + "\n"
                + "Annual salary: " + getAnnualSalary();
    }
}