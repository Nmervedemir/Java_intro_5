package exception_handling.try_catch;

import utilities.ScannerHelper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch_Practice02 {
    public static void main(String[] args) {
        /*
        Write a program that gets 2 numbers from the user as int
        THen divide these numbers and print the result

        Print a message saying "End of the program
         */

        try {
            int num1 = ScannerHelper.getANumber();
            int num2 = ScannerHelper.getANumber();
            System.out.println(num1 / num2);
        } catch (InputMismatchException | ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
