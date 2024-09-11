package domain;

public class TechLead extends People implements Duties{
    private int numberOfEmployeesManaged;

    public TechLead(String name, String age, int numberOfEmployeesManaged) {
        super(name, age);
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
        System.out.println("I design new solutions for the projects");
    }
}
