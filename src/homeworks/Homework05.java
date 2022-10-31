package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        String result = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) result += i + " - ";

        }
        System.out.println(result.substring(0, result.length() - 3));


        System.out.println("===== Task 2 =====");
        String resultTask2 = "";
        for (int j = 1; j <= 50; j++) {
            if (j % 6 == 0) resultTask2 += j + " - ";
        }
        System.out.println(resultTask2.substring(0, resultTask2.length() - 3));


        System.out.println("===== Task 3 =====");
        String resultTask3 = " ";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) resultTask3 += i + " - ";
        }
        System.out.println(resultTask3.substring(0, resultTask3.length() - 3));

        System.out.println("===== Task 4 =====");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i * i));


        }


        System.out.println("===== Task 5 =====");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("===== Task 6 =====");
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter positive number: ");
        int num = inputReader.nextInt();
        int i = 1, factorial = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of the number: " + factorial);

        System.out.println("===== Task 7 =====");

        String fullName = ScannerHelper.getAName();
        fullName = fullName.toLowerCase();
        int count = 0;
        for (int j = 0; j < fullName.length(); j++) {
            if (fullName.charAt(j) == 'a' || fullName.charAt(j) == 'e' || fullName.charAt(j) == 'i'
                    || fullName.charAt(j) == 'o' || fullName.charAt(j) == 'u')
                count++;
        }
        System.out.println("There are " + count + " vowel letters in this full name");

        System.out.println("===== Task 8 =====");
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sum1 = 0;

        do {
            System.out.print("Hey User Enter number: ");
            input = scanner.nextInt();
            if (input >= 100) {
                System.out.println("Number is already more than 100");
                break;
            }
            if (sum1 + input <= 100)
                sum1 += input;

        } while (sum1 < 100);

        System.out.println("Sum of Numbers : " + sum);

        System.out.println("===== Task 9 =====");
        int n = ScannerHelper.getANumber();
        String result9 = "";
        int fNum = 0, sNum = 1;
        int sumPreviousTwo;
        for (int k = 1; k <= n; k++) {
            result9 += fNum + " - ";
            sumPreviousTwo = fNum + sNum;
            fNum = sNum;
            sNum = sumPreviousTwo;
        }
        System.out.print(result9.substring(0, result9.length() - 3));

        System.out.println("===== Task 10 =====");

        System.out.println("Please enter a name");
        String fName = scanner.nextLine();

        for (; ; ) {
            if (fName.charAt(0) == 'j' || fName.charAt(0) == 'J') {
                System.out.println("End of the program");
                break;
            } else {
                System.out.println("Please enter a new name");
                fName = scanner.nextLine();
            }


        }
    }
}

























