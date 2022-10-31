package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class project04 {
    public static void main(String[] args) {
        System.out.println("=======Task1=======");

        String name = ScannerHelper.getAString();
        if (name.length() >= 8) {
            String str1 = name.substring(0, 4);
            String str2 = name.substring(4, name.length() - 4);
            String str3 = name.substring(name.length() - 4);
            System.out.println(str3 + str2 + str1);
        } else {
            System.out.println("This string");
        }

        System.out.println("=======Task 2 =======");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = inputReader.nextLine();

        if (sentence.length() <= 1) {
            System.out.println("This sentence does not have 2 or more words to swap ");
        } else {
            System.out.println(sentence.substring(sentence.length() - 4) + sentence.substring(8, sentence.length() - 4) + sentence.substring(0, 8));
        }


        System.out.println("=======Task 3 =======");

        String str1 = ScannerHelper.getAString();
        System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));

        System.out.println("=======Task 4 =======");

        String name1 = ScannerHelper.getAName();
        if(name.length() >2){
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length()/2-1, name.length()/2+1));
            else System.out.println(name.charAt(name.length()/2));
        }else {
            System.out.println("Invalid input!!!");
        }
        System.out.println("=======Task 5 =======");

        String country = ScannerHelper.getACountry();
        if(country.length()>=5){
            System.out.println(country.substring(2,country.length()-2));
        }
        else {
            System.out.println("Invalid input!!!");
        }

        System.out.println("=======Task 6 =======");

        String str2 = ScannerHelper.getAnAddress();
        System.out.println(str2.replace("a", "*").replace("A", "*").replace("e", "#").replace("E", "*").replace("i", "+").replace("I", "+").replace("u", "$").replace("U", "$").replace("o", "@").replace("O", "@"));

        System.out.println("=======Task 7 =======");
        int randomNumber1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int randomNumber2 = RandomNumberGenerator.getARandomNumber(0, 25);
        String result = "";
        for (int i = Math.min(randomNumber1, randomNumber2); i <= Math.max(randomNumber1, randomNumber2); i++) {
            if (i % 5 != 0)
                result += i + " - ";
        }
        System.out.println(result.substring(0, result.length() - 3));

        System.out.println("=======Task 8 =======");

        String sentence2 = ScannerHelper.getAString();

        int count = 0;

        for (int i = 0; i < sentence2.length(); i++){
            if(sentence2.charAt(i) == ' '){
                count++;
            }
        }
        if (count >= 1) {
            System.out.println("This sentence has " + (count + 1) + " words.");
        } else {
            System.out.println("This sentence does not have multiple words");
        }

        System.out.println("=======Task 9 =======");
        int number3= ScannerHelper.getANumber();
        for (int i = 1; i <= number3; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else
                System.out.println(i);
        }

        System.out.println("=======Task 10 =======");
        String word = ScannerHelper.getAString();
        String reverseWord = "";
        if(word.length()>1) {
            for (int i = word.length() - 1; i >= 0; i--)
                if(reverseWord.equals(word))
                    reverseWord += word.charAt(i);
            System.out.println("This word is palindrome");
        }else
        {System.out.println("This word does not have 1 or more characters");
        }

        System.out.println("=======Task 11 =======");
        String sentence3 = ScannerHelper.getAString();
        int count2 = 0;
        if (sentence3.length() > 1) {
            for (int i = 0; i < sentence3.length(); i++) {
                if (sentence3.toLowerCase().charAt(i) == 'a') count2++;
            }
            System.out.println("This sentence has " + count2 + " a or A letters. ");
        } else {
            System.out.println("This sentence does not have any characters");
        }








    }
    }


