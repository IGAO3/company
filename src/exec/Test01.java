package exec;

import domain.Employee;
import domain.staff.*;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<? extends Employee> employees = new ArrayList<>(List.of(new TechLead("Luffy", 19, "Tech-Lead", 13000, 9),
                new Developers("Zoro", 21, "Senior Software Developer", 10000, "Java/Typescript", "Full stack"),
                new DataEngenieer("Sanji", 21, "Senior Data Engenieer", 9000),
                new SoftwareArchitect("Nami", 20, "SoftwareArchitect", 9000),
                new ScrumMaster("Chopper", 17, "Scrum Master", 8000),
                new ProductManager("Nico Robin", 30, "Product Manager", 9700),
                new QA("Franky", 36, "QA", 7000),
                new UxUiDesigner("Brook", 90, "UI/UX Designer", 7500),
                new DevOpsEngenieer("Jinbei", 46, "Senior DevOps Engenieer", 8500)));

        for (Employee employee : employees){
            System.out.println(employee);
        }

        conta conta = new conta("Igor", 27, "suporte", 10000);
        conta.tasks();
        System.out.println(conta);
    }
}
