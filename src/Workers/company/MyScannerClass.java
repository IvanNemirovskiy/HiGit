package Workers.company;

import java.util.Scanner;

class MyScannerClass {
    public static void main(String[] args) {
        int x, y, result, age;
        String true1, ya = "Yes";

         Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = myScan.nextInt();
        if (age < 18) {
            System.out.println("Asses denied ");
        } else if (age >= 80) {
            System.out.println("Is that true? ");
            true1 = myScan.nextLine();
            true1 = myScan.nextLine();
            if (true1.equalsIgnoreCase(ya)) {
                System.out.println("You are welcome!");
            } else {
                System.out.println(0/0);
            }
        } else {
            System.out.println("You are welcome!");
        }


        final double cmPerInch = 2.54;
        double width;
        double height;
        String userName;
        double resultExchange;

        System.out.println("Enter width of paper in inches : ");
        width = myScan.nextDouble();
        width = myScan.nextDouble();
        System.out.println("Enter height of paper in inches : ");
        height = myScan.nextDouble();
        System.out.println("Enter your UserName : ");
        userName = myScan.nextLine();
        userName = myScan.nextLine();
        resultExchange = width * cmPerInch + height * cmPerInch;
        System.out.println("calculations conducted - " + userName + " " + "," + "\n" + "Result is : " + resultExchange + " " + "centimeters");

   /* System.out.println("Type a number: ");
    x = myScan.nextInt();
    System.out.println("Enter second number: ");
    y = myScan.nextInt();
    result = x+y;
    System.out.println("Result is : " + result);*/
    }
}
