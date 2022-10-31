package homeworks;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("===== Task 1 =====");

        int [] numbers = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("===== Task 2 =====");

        String[] letters = new String[5] ;
        letters[1]= "abc";
        letters[4]= "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);

        System.out.println(Arrays.toString(letters));

        System.out.println("===== Task 3 =====");

        int [] numbers1 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers1));

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        System.out.println("===== Task 4 =====");

        String [] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));

        System.out.println("===== Task 5 =====");

        String [] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky" };

        System.out.println(Arrays.toString(dogs));

        boolean hasPluto = false;

        for (String dog : dogs) {
            if(dog.equals("Pluto") ) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);

        System.out.println("===== Task 6 =====");

        String [] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.binarySearch(cats, "Garfield") + Arrays.binarySearch(cats, "Feliz") >= 0 );

        System.out.println("===== Task 7 =====");

        double [] numbers2 = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(numbers2));

        for(double number : numbers2){
            System.out.println(number);
        }

        System.out.println("===== Task 8 =====");

            char [] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4' };

            System.out.println(Arrays.toString(characters));

        int countU1 = 0;

        for (char character : characters) {
            if(Character.isLetter(character)) countU1++;
        }
        System.out.println("Letter =" + " " +  countU1);
        int countU2= 0;

        for (char character : characters) {
            if(Character.isUpperCase(character)) countU2++;
        }
        System.out.println("Uppercase letter =" + " " + countU2);

        int countU3= 0;

        for(char character : characters){
            if(Character.isLowerCase(character)) countU3++ ;
        }
        System.out.println("Lowecase letters =" + " " + countU3);

        int countU4 = 0;

        for(char character : characters){
            if(Character.isDigit(character)) countU4++ ;
        }
        System.out.println("Digits = " + " " +countU4);

        int countU5 = 0;

        for(char character : characters){
            if(Character.isLetter(character) == Character.isDigit(character)) countU5++ ;
        }
        System.out.println("Special characters = " + " " +countU5);

        System.out.println("===== Task 9 =====");

        String [] elements = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(elements));

        int countUppercase = 0;

        for (String el: elements ) {
            if(Character.isUpperCase(el.charAt(0))) countUppercase++ ;
        }
        System.out.println("Elements starts with uppercase = " +  countUppercase);
            int countLowercase = 0 ;
        for (String el: elements ) {
            if(Character.isLowerCase(el.charAt(0))) countLowercase++ ;
        }
        System.out.println("Elements starts with lowercase = " +  countLowercase);
          int containsBP = 0 ;

            for(String el :elements) {
               if(el.toLowerCase().startsWith("b") || el.toLowerCase().startsWith("p") ) containsBP++ ;
            }
        System.out.println("Elements starting with B or P = " + containsBP);
            int containsP = 0;

            for(String el: elements){
                if(el.toLowerCase().contains("book") || el.toLowerCase().contains("pen") ) containsP++ ;
            }
        System.out.println("Elements having 'book' or 'pen' = " + containsP);

        System.out.println("===== Task 10 =====");

        int[] numbers3 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbers3));

        int count = 0;
        for (int j = 0; j < numbers3.length; j++) {
            if(numbers3[j] > 10 ) count++ ;
        }

        System.out.println("Elements that are more than 10 = " + count);

        int count1 = 0;
        for (int i = 0; i < numbers3.length ; i++) {
            if(numbers3[i] < 10 ) count1++ ;
        }
        System.out.println("Elements that are less than 10 = " + count1);

        int count2 = 0;
        for (int i = 0; i < numbers3.length; i++) {
            if(numbers3[i] == 10 ) count2++;
        }
        System.out.println("Elements that are 10 = " + count2);

        System.out.println("===== Task 11 =====");
        int[][] numbers4 = {
                {5, 8, 13, 1, 2},
                {9, 3, 67, 1, 0} } ;
        System.out.println("1st array is = " + Arrays.toString(numbers4[0])+ "\n2nd array is = " + Arrays.toString(numbers4[1]) );

            int[] numbers5 = new int [5];
        for (int i = 0; i < numbers5.length ; i++) {
            numbers5[i] = Math.max(numbers4[0][i], numbers4[1][i]);
        }

        System.out.println("3rd array is = " + Arrays.toString(numbers5));




        }



        }





















