package domain.staff;

import domain.Duties;
import domain.Employee;

public class conta extends Employee implements Duties {

    public conta(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {

    }
}
