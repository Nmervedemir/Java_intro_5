package homeworks;


import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.Scanner;

public class Homework04 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");

        String name = ScannerHelper.getAName();
        System.out.println("The length of the name is =" + name.length());
        System.out.println("First character in the name is =" + name.charAt(0));
        System.out.println("Last character in the name is =" + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The first 3 characters in the name are = " + name.substring(2));
        if (name.startsWith("A")) {
            System.out.println("You are in the club! ");

        } else {

            System.out.println("Sorry, you are not in the club");
        }
        System.out.println("===== Task 2 =====");

        String address = ScannerHelper.getAnAddress();
        if (address.toLowerCase().contains("Chicago")) {
            System.out.println("You are in the club");
        } else if (address.contains("Des Plaines")) {
            System.out.println("You are welcome to join the club");
        } else {
            System.out.println("Sorry, you are not in the club");
        }


        System.out.println("===== Task 3 =====");


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your favorite colors (At least 4)");

        String colors = input.nextLine();


        if (colors.toLowerCase().contains("green") && colors.contains("red")) {
            System.out.println("Green and red are in the list");
        } else if (colors.contains("red")) {

            System.out.println("Red is in the list");
        }else if (colors.toLowerCase().contains("green") ) {
            System.out.println("Green is in the list");
        }else {
            System.out.println("Green and red are not in the list");
        }

        System.out.println("===== Task 4 =====");

        String str= "  Java is FUN  " ;

        System.out.println("The first word in the str is ="+ str. toLowerCase() .substring(2, 6));
        System.out.println("The second word in the str is ="+ str. toLowerCase() .substring(7, 9));
        System.out.println("The third word in the str is ="+ str. toLowerCase() .substring(10, 14));

    }






}
