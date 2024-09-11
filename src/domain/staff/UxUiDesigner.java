package domain.staff;

import domain.Duties;
import domain.Employee;

public class UxUiDesigner extends Employee implements Duties {
    public UxUiDesigner(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {
        System.out.println("Design the user interface (UI) and user experience (UX) to ensure that the software is intuitive and engaging.");
    }
}
