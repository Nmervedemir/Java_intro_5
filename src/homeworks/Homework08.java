package homeworks;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("===== Task 1 =====");
        String str = ScannerHelper.getAString();
        System.out.println(countConsonants(str));

        System.out.println("===== Task 2 =====");
        String str1 = "hello ";
        System.out.println(Arrays.toString(wordArray(str1)));

        System.out.println("===== Task 3 =====");
        String str2 = "Hello,    nice to   meet     you!!";
        System.out.println(removeExtraSpaces(str2));

        System.out.println("===== Task 4 =====");
        String str3 =ScannerHelper.getAString();
        System.out.println(count3OrLess(str3));

        System.out.println("===== Task 5 =====");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your date of birth");
        String str4= scan.nextLine();
        System.out.println(isDateFormatValid(str4));

        System.out.println("===== Task 6 =====");
         Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your email");
        String str5= scan.nextLine();
        System.out.println(isEmailFormatValid(str5));



    }



    public static int countConsonants(String str){
        return str.toLowerCase().replaceAll("[aeiou]", "").length();

    }

    public static String[] wordArray(String str1) {
       str1 = str1.replaceAll("\\s+", " ").trim();
        String[] wordArray = str1.split(" ");
        return wordArray;

    }


    public static String removeExtraSpaces(String str2){
        return str2.replaceAll("\\s+", " ");

    }

    public static int count3OrLess(String str3){
        String[] s = str3.split("[A-Za-z]{4,}");
        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher matcher = pattern.matcher(Arrays.toString(s));

        int counter =0;
        while (matcher.find()){
            counter++;
        }
        return counter;

    }
    public static boolean isDateFormatValid(String str4){
        return str4.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}" );

    }

    public static boolean isEmailFormatValid(String str5){
        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[\\w]{2,}", str5));
    }



}
