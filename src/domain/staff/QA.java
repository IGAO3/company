package domain.staff;

import domain.Duties;
import domain.Employee;

public class QA extends Employee implements Duties {
    public QA(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {
        System.out.println("Create and document test plans to ensure all software functionalities are tested.");
        System.out.println("Identify, document, and communicate bugs and issues found during testing to the development team.");
        System.out.println("Conduct tests to evaluate the performance and security of the software.");
    }
}
