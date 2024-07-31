package employee;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private final LocalDate birthday;
    private int salary;
    private List<String> awards;

    public Employee(String name, String surname, LocalDate birthday, int salary, List<String> awards) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        this.awards = awards;
    }

    public Employee(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getSalary() {
        return salary;
    }

    public List<String> getAwards() {
        return awards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(birthday, employee.birthday) && Objects.equals(awards, employee.awards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthday, salary, awards);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", awards=" + awards +
                '}';
    }
}
