package domain.staff;

import domain.Duties;
import domain.Employee;

public class ProductManager extends Employee implements Duties {
    public ProductManager(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {
        System.out.println("Plan, coordinate, and manage the project's progress");
        System.out.println("Ensure that goals and deadlines are met");
        System.out.println("Handle communication between the team and stakeholders");
    }
}
