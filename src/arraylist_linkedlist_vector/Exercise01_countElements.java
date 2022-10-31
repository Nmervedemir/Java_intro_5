package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {
        /*
        Create and ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple

        Print the ArrayList
        Print the size
        Print each element separately
         */


        System.out.println("\n-------TASK 1--------\n");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));



        System.out.println(colors);
        System.out.println(colors.size());

        for(String color : colors){
        System.out.println(color);

        }

        /*
        Count the elements that has length of 6

        EXPECTED:
        2
                */

        System.out.println("\n------TASK-2 - Elements that has length of 6-------\n");

        int count6 = 0;

        for (String color : colors) {
            if(color.length() == 6) count6++;
        }

        System.out.println(count6); // 2

        count6 = 0; // Resetting your counter

        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).length() == 6) count6++;
        }

        System.out.println(count6); // 2
        /*
        Count the element that has "o"
        //Brown Yellow
        2
         */
        System.out.println("\n------TASK-3 - Elements that has 'o'-------\n");

        int ocounter = 0;
        for (String color : colors) {
            if(color.contains("o")) ocounter++;
        }
        System.out.println(ocounter);

        ocounter = 0;
        for (int i = 0; i < colors.size(); i++) {
           if(colors.get(i).toLowerCase().contains("o")) ocounter++;

        }

        System.out.println(ocounter);




    }
}
