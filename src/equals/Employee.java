package equals;


import org.omg.CORBA.Object;

import java.time.*;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hairDay;

    public Employee(
            String name, double salary, int year, int month, int day
    ) {
        this.name =name;
        this.salary = salary;
        hairDay = LocalDate.of(year, day, month);

    }
    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;

    }

    public LocalDate getHairDay() {
        return hairDay;

    }
    public String getDescription(){
        return String.format("an employee with salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject){

        //fast check objects on identification
        if (this == otherObject) return true;

        //if explicit param have empty value null
        //must return logical value false
        if (otherObject == null) return false;

        //if classes aren't matching up
        if (getClass() != otherObject.getClass()) return false;

        //now we know , that OtherObject -- that's
        // isn't empty object of Employee type
        Employee other = (Employee) otherObject;

        // check , would fields have similar values
        return Objects.equals(name , other.name)
                && salary == other.salary
                && Objects.equals(hairDay , other.hairDay);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hairDay);
    }
    public String toString(){
        return getClass().getName() + "[name = " + name
                + ", salary= "+ salary +" ,hairDay=" + hairDay + "]";
    }
}
