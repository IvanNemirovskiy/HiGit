package Workers.company;

import java.util.HashMap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class MyDate {
    public static void main(String[] agrs) {
        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println("Before formatting" + myObj2);
        DateTimeFormatter ftime = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:ms:ss");
        String formattedDate = myObj2.format(ftime);
        System.out.println("After formatted" + formattedDate);
        //Array List with Numbers
        ArrayList<Integer> favoriteNum = new ArrayList<Integer>();
        favoriteNum.add(88);
        favoriteNum.add(14);
        favoriteNum.add(99);
        Collections.sort(favoriteNum);  // Sort myNumbers
        for (int i : favoriteNum) {
            System.out.println(i);

            // HashMap
            HashMap<String, String> Capital = new HashMap<String, String>();
            Capital.put("Ukraine", "Kyiv");
            Capital.put("Russia", "Moscow");
            Capital.put("Belarus", "Minsk");


            for (String a : Capital.keySet()){
                System.out.println(a);
            }
        }


        //Array List training "String"
        ArrayList<String> Story = new ArrayList<String>();
        Story.add("Once");
        Story.add("upon");
        Story.add("a");
        Story.add("time");
        Story.set(0, "Second");
        // Cycle with String
        for (String i : Story) {
            System.out.println(i);
        }
        // Cycle with Integer
        for (int i = 0; i < Story.size(); i++) {
            System.out.println(Story.get(i));
        }
        System.out.println(Story + formattedDate);

    }
}
