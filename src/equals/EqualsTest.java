package equals;

public class EqualsTest {
    public static void main(String[] args){
        Employee alice1 =new Employee("Alice Devis" , 98876, 2018, 5, 11);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Devis" , 98876, 2018, 5, 11);

        Employee bob = new Employee("Bob Simons", 94834, 2016, 6, 11);

        System.out.println("alice1 == alice2 :" + (alice1 == alice2));
        System.out.println("alice1 == alice3 :" + (alice1 == alice3));
        System.out.println("alice1.equals(alice3)" + alice1.equals(alice3));
        System.out.println("alice1.equals(bob)" + alice1.equals(bob));
        System.out.println("bob.toString" + bob);

        Manager carl = new Manager("Carl Nouser", 98755, 2013, 19,11);
        Manager boss = new Manager("Carl Nouser", 98755, 2013, 19,11);
        boss.setBonus(5000);
        System.out.println("boss.toString() : " + boss);
        System.out.println("carl.equals(boss) :" +carl.equals(boss));
        System.out.println("alice1.hashCode() :" +alice1.hashCode());
        System.out.println("alice3.hashCode() :" +alice3.hashCode());
        System.out.println("bob.hashCode() :" +bob.hashCode());
        System.out.println("carl.hashCode() :" +carl.hashCode());


    }
}
