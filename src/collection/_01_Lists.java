package collection;

import sun.util.resources.cldr.uz.CalendarData_uz_Arab_AF;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static <LinkedListList> void main(String[] args) {

        /*
        -They preserve insertion order
        -They allow duplicates
        -They allow null elements

        -Performance
        -Memory
        -Initial capacity
        -Load
        -The way they store the data



         */

       LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");


        System.out.println(fruits); //Pineapple


        fruits.clear();


        System.out.println(fruits.poll()); //null
        System.out.println(fruits.remove()); //.NoSuchElementException

    }
}
