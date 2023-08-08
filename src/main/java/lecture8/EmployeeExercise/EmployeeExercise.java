package lecture8.EmployeeExercise;

public class EmployeeExercise {
    public static void main(String[] args) {
        Employee employee = new Employee("1", "Marin", "Petrov", 1200);
        String name = employee.getName();
        int annualSalary = employee.getAnnualSalary();
        System.out.println(employee);

        int raisedSalary = employee.raiseSalary(10);
        annualSalary = employee.getAnnualSalary();
        System.out.println(employee);
    }
}