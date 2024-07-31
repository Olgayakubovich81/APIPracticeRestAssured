package employee;

import java.time.LocalDate;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("oleg", "mikhailov", LocalDate.of(1982,12,5));
        Employee employee1= new Employee("Denis", "Ivanov",LocalDate.of(1990,12,6),4000, List.of("best employee of the year", "greatest salary of month"));
        employee.setSalary(6000);
        employee.setAwards(List.of("best swimmer"));
        Departament department= new Departament("23", "Finance", List.of(employee,employee1));
        Departament departament1= new Departament();
        departament1.setId("34");
        departament1.setName("Marketing");
        departament1.setEmployees(List.of(new Employee ("Semen", "Ivanov", LocalDate.of(1987,12,4))));
    }


}
