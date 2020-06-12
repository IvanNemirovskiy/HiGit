package Workers.company;

import java.util.Random;
import java.util.Scanner;

class GetClass {

    public static void main(String[] args) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String randomString = "";
        //int lenght = 7;

        Random rand = new Random();
        int lenght =  rand.nextInt(16) +1;
        char[] text = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
            if (i == 0 ) {
                randomString = randomString.toUpperCase();
            }
        }


        Scanner newScan = new Scanner(System.in);
        System.out.print("What's your name ? If you don't have a name, press enter ");
        String name = newScan.nextLine();
        if (name == null) ;
        System.out.print("Enter was pressed" + " your name is " + randomString);

    }
}
