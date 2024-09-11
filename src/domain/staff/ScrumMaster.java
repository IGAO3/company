package domain.staff;

import domain.Duties;
import domain.Employee;

public class ScrumMaster extends Employee implements Duties {
    public ScrumMaster(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {
        System.out.println("Facilitate the implementation of the Scrum agile methodology.");
        System.out.println("Remove impediments for the team.");
        System.out.println("Ensure that agile practices are followed.");
    }
}
