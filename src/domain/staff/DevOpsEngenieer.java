package domain.staff;

import domain.Duties;
import domain.Employee;

public class DevOpsEngenieer extends Employee implements Duties {
    public DevOpsEngenieer(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {
        System.out.println("Facilitate continuous integration and continuous delivery (CI/CD).");
        System.out.println("Manage infrastructure, and ensure that the software is deployed efficiently and reliably.");
    }
}
