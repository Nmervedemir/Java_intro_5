package projects;

public class project03 {

    public static void main(String[] args) {

        System.out.println("---Task1---");

        String s1 = "24", s2 = "5";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);


        System.out.println("Sum of 24 and 5 is = " + (i1 + i2));
        System.out.println("Product of 24 and 5 is = " + (i1 * i2));
        System.out.println("Division of 24 and 5 is = " + (i1 / i2));
        System.out.println("Subtraction of 24 and 5 is = " + (i1 - i2));
        System.out.println("Remainder of 24 and 5 is = " + (i1 % i2));

        System.out.println("\n------Task2------");

        int randomBetween1to35 = (int) (Math.random() * (35) + 1);
        System.out.println(randomBetween1to35);
        if (randomBetween1to35 == 1) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 3) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 5) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 7) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 11) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 13) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 17) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 19) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 23) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 29) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 31) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }


        System.out.println("\n------Task3------");

        int random1 = (int) (Math.random() * (50 - 1 + 1) + 1);
        int random2 = (int) (Math.random() * (50 - 1 + 1) + 1);
        int random3 = (int) (Math.random() * (50 - 1 + 1) + 1);

        System.out.println("Random number 1 = " + random1);
        System.out.println("Random number 2  = " + random2);
        System.out.println("Random number 3 = " + random3);

        int max = Math.max(Math.max(random1, random2), random3);
        int min = Math.min(Math.min(random1, random2), random3);
        System.out.println("Lowest number is = " + min);

        if (random1 < max && random1 > min) {
            System.out.println("Middle number is = " + random1);
        } else if (random2 < max && random2 > min) {
            System.out.println("Middle number is = " + random2);
        } else {
            System.out.println("Middle number is = " + random3);
        }
        System.out.println("Greatest number 1 = " + random3);

        System.out.println("\n------Task 4------");

        char a1 = 'a';
        if (a1 >= 65 && a1 <= 90) {

            System.out.println("The letter is uppercase");
        } else if (a1 > 97 && a1 <= 122) {

            System.out.println("The letter is lowercase ");
        } else {
            System.out.println("Invalid character detected!!! ");
        }

        System.out.println("End of program! ");

        System.out.println("\n------Task 5------");
        char b1 = '0';
        if (b1 >= 65 && b1 <= 90 && b1 <= 122) {
            if (b1 == 65 || b1 == 69 || b1 == 73 || b1 == 79 || b1 == 85 || b1 == 89 ||
                    b1 == 97 || b1 == 101 || b1 == 105 || b1 == 111 || b1 == 117 || b1 == 121) {
                System.out.println("The letter is vowel");
            } else {
                System.out.println("The letter is consonat");
            }

        }

        System.out.println("\n------Task 6------");

        char c1 = '#' ;
        if (c1 >= 65 && c1 <= 90 && b1 <= 122 || c1 >= 48 && c1<= 57){
            System.out.println("Invalid character deected !!!");
        }
         else {
            System.out.println("Special character is = " +c1);
        }
        System.out.println("End of program! ");



        System.out.println("\n------Task 7------");

        char d1= '8';

        if (d1 >= 65 && d1 <= 90 || d1 <= 97 &&  d1 <= 122);
        {

            System.out.println("Character is a letter");


        }
        if (d1 >= 48 && d1<=57) {
            System.out.println("Character is a digit");
        }
        else {
            System.out.println("Character is a special character ");
        }
        System.out.println("End of program! ");


    } }
