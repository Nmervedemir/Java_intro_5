package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {
        /*
        Create an ArrayList and store below cities in it
        Chicago
        Berlin
        Miami

        Print the size of the ArrayList
        Print the ArrayList

        EXPECTED:
        3
        [Chicago,Berlin,Miami]
         */

        System.out.println("\n------TASK-1------\n");
        ArrayList<String> cities = new ArrayList<>();//capacity is 10
         cities.add("Chicago");
         cities.add("Berlin");
         cities.add("Evanston");

        System.out.println("The size of the ArrayList= " + cities.size());
        System.out.println("The ArrayList = " + cities);

        /*
        replace Miami w Evanston

         */
        System.out.println("\n------TASK-2------\n");
        cities.set(2,"Evaston");
        System.out.println(cities);

        System.out.println("\n------TASK-3------\n");

        /*
        remove BErlin
        Print the Array List
        print the size
         */

        //cities.remove(1);
        cities.remove("Berlin"); //[Chicago, Evaston]

        System.out.println(cities);//2
        System.out.println(cities.size()); // false

        System.out.println(cities.remove(0)); //Chiago
        System.out.println(cities.remove("evanston")); //false

        System.out.println(cities);//[Evaston]
        System.out.println(cities.size()); //1

        System.out.println("\n------TASK-4------\n");

            /*
    TASK
    Add below cities to ArrayList
    New York
    Rome
    Ghent

    Print the ArrayList
    Print the size

    EXPECTED:
    [Evanston, New York, Rome, Gent]
    4
     */

        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n------TASK-5------\n");
        /*
       Remove all the cities

         */

        cities.clear();
        //cities.removeAll(cities);
        System.out.println(cities);
        System.out.println(cities.size());










    }
}
