package domain.staff;

import domain.Duties;
import domain.Employee;

public class TechLead extends Employee implements Duties {
    private int numberOfEmployeesManaged;

    public TechLead(String name, int age, String jobTitle, double salary, int numberOfEmployeesManaged) {
        super(name, age, jobTitle, salary);
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }

    @Override
    public String toString() {
        return "TechLead{" +
                "numberOfEmployeesManaged=" + numberOfEmployeesManaged +
                "} " + super.toString();
    }

    public int getNumberOfEmployeesManaged() {
        return numberOfEmployeesManaged;
    }

    public void setNumberOfEmployeesManaged(int numberOfEmployeesManaged) {
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }

    @Override
    public void tasks() {
        System.out.println("I manage the amout of:" + numberOfEmployeesManaged + "empolyees");
        System.out.println("I direct what each developer needs to do during the week");

    }
}
