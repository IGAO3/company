package domain.staff;

import domain.Duties;
import domain.Employee;

public class SoftwareArchitect extends Employee implements Duties {
    public SoftwareArchitect(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {
        System.out.println("I design new solutions for the projects");
        System.out.println("Creating the overall structure of the software, including dividing it into modules, layers, and components.");
        System.out.println("Choosing the most appropriate technologies and tools for the project.");
    }
}
