package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] students= {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"}
        };
        System.out.println(students[0][1]);//mehmet
        System.out.println(students[1][1]);//regina

        System.out.println(students.length); //

        //Printing inner arrays with fori loop
        for (int i = 0; i < students.length ; i++) {
            System.out.println(Arrays.toString(students[i]));
        }
        //Printing inner arrays with for each
        for(String[] group : students){
            System.out.println(Arrays.toString(group));
        }

        //Printing the multi-dimensional array
        System.out.println(Arrays.deepToString(students)); // [[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]


        /*
        TASK
        Print each member in different lines
        Ali
        Mehmet
        ALex
        Alex
        Regina
        Abdallah
        Newer
         */
//Printing each students with for each loop
        for(String[] group : students){
            for(String student : group) {
                System.out.println(student);
            }
        }

        // Printing each student with fori loop

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students [i][j]);

            }

        }

        }
    }

