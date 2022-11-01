package homeworks;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("===== Task 1 =====");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));

        System.out.println("===== Task 2 =====");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("===== Task 3 =====");

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(23, -34, -56,0,89,100));

        System.out.println(numbers2);

        Collections.sort(numbers2);
        System.out.println(numbers2);

        System.out.println("===== Task 4 =====");

        ArrayList<String>cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris "));

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("===== Task 5 =====");

        ArrayList<String> marvel = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));

        System.out.println(marvel);

        System.out.println(marvel.contains("Wolwerine"));

        System.out.println("===== Task 6 =====");

        ArrayList<String> avengers = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        System.out.println(avengers);

        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("===== Task 7 =====");

        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('A','x','$','%','9','*','+','F','G'));

        System.out.println(ch);

        for(Character characters : ch) {
            System.out.println(characters);
        }

        System.out.println("===== Task 8 =====");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk","Laptop","Mouse","Monitor","Mouse-Pad","Adapter"));

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0;
        int countAOrE = 0;
        for (String object: objects){
            if (object.startsWith("M") || object.startsWith("m")) countM++;
            if (object.startsWith("A") || object.startsWith("a") || object.startsWith("E") || object.startsWith("e"))
                countAOrE++;
        }
        System.out.println(countM + "\n" + countAOrE);

        System.out.println("===== Task 9 =====");

        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList("Plate","spoon","fork","Knife","cup","Mixer"));
        System.out.println(kitchen);

        int countUppercase = 0;

        for (String obj: kitchen ) {
            if(Character.isUpperCase(obj.charAt(0))) countUppercase++ ;
        }
        System.out.println("Elements starts with uppercase = " +  countUppercase);

        int countLowercase = 0 ;
        for(String obj : kitchen){
            if(Character.isLowerCase(obj.charAt(0))) countLowercase++ ;
        }

        System.out.println("Elements starts with lowercase = " +  countLowercase);

        int containsPp = 0 ;

        for(String object :kitchen){
            if(object.toLowerCase().contains("p")  ) containsPp++ ;
        }
        System.out.println("Elements having P or p=" + containsPp);

        int containsP = 0 ;

        for(String object : kitchen) {
            if(object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p") ) containsP++ ;
        }

        System.out.println("Elements starting or ending with P or p =" + containsP);


        System.out.println("===== Task 10 =====");

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        System.out.println(numbers3);

        int counter10 = 0;
        int counterMore = 0;
        int counterLess = 0;
        int counterLessG = 0;

        for ( int num : numbers3) {
            if(num % 10 == 0 ) counter10 ++;
            if(num % 2 ==0 && num > 15 ) counterMore ++ ;
            if (num % 2 ==1 && num < 20 ) counterLess++;
            if (num < 15 || num > 50 ) counterLessG++;
        }

        System.out.println("Elements that can be divided by 10 ="+ counter10 +
                "\nElements that are even and greater than 15 =" + counterMore +
                "\n Elements that are odd and less than 20 =" +counterLess +
                "\n Elements that are less than 15 or greater than 50 = " +counterLessG);


    }
}