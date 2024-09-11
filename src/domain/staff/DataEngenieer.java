package domain.staff;

import domain.Duties;
import domain.Employee;

public class DataEngenieer extends Employee implements Duties {
    public DataEngenieer(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void tasks() {
        System.out.println("Work with the management and processing of large volumes of data");
        System.out.println("Ensuring that the data is ready for analysis and consumption.");
    }
}
