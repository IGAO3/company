package domain.staff;

import domain.Duties;
import domain.Employee;

public class Developers extends Employee implements Duties {
    private String stack;
    private String areaOfExpertise;

    public Developers(String name, int age, String jobTitle, double salary, String stack, String areaOfExpertise) {
        super(name, age, jobTitle, salary);
        this.stack = stack;
        this.areaOfExpertise = areaOfExpertise;
    }

    @Override
    public String toString() {
        return "Developers{" +
                "stack='" + stack + '\'' +
                ", areaOfExpertise='" + areaOfExpertise + '\'' +
                "} " + super.toString();
    }

    @Override
    public void tasks() {
        System.out.println("I work on the tasks that have been given to me by the team lead");
        System.out.println("I'm always trying to figrue some new solutions to optimaze the project");
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }
}
