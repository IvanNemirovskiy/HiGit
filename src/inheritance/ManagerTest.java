package inheritance;

import equals.Employee;
import equals.Manager;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Rayan Fenando", 90000, 1993,28 , 11);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Derric Caruso", 89000, 1995, 8, 1);
        staff[2] = new Employee("Demian Silva", 88000, 1999, 30, 5);
        for (Employee e : staff) {
            System.out.println("Name " + e.getName() + ",salary " + e.getSalary());
        }

    }
}
