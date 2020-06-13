package Workers.company;

import com.abstractClasses.PersonTest;
import equals.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

        Size s = Size.SMALL;
        Size m = Size.MEDIUM;
        Size l = Size.LARGE;
        Size xl = Size.EXTRA_LARGE;

        public static void main(String[] args) {

            SimpleGUI2 app2 = new SimpleGUI2();
            app2.setVisible(true);
            SimpleGUI app1 = new SimpleGUI();
            app1.setVisible(true);



            Scanner scanw = new Scanner(System.in);
           // System.out.println("What's your name ?");

            /*   int day = 99;
            switch (day){
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Week have only 7 days");
            }

        }
       /* String git = "Hi git";
        System.out.println(git);
        int eat = 15, dinner = 17;
        String result = (eat > dinner) ? "good luck" : "Good taste";
        System.out.println(result);
        String company = "KawhiTV\u2122";
        String KawhiDVD = company.substring(0, 4) + "DVD";
        System.out.println(KawhiDVD);
        String s = company.substring(0, 8);
        System.out.println(s);
        String c = company.substring(0, 0) + "degeg";
        System.out.println(c);
        String pizza = String.join("/", "S", "M", "L", "XL");
        System.out.println(pizza);
        "Hello".equals(company);
        "Hello".equalsIgnoreCase(company);
        //--Ниже проверяем строку на равенство--
        String greeting = "Hello";
        if (greeting.compareTo("Hello") == 0) {
            System.out.println("Tre");*/

            System.out.printf("%, .2f", 10000.0 / 3.0);


        }


    }


//}

