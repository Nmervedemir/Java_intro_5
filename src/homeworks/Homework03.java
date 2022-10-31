package homeworks;

import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1?");
        int number1 = input.nextInt();
        System.out.println("Please enter number 2?");
        int number2 = input.nextInt();
        System.out.println("The difference between number is =" + Math.abs(number1 - number2));
        System.out.println("===== Task 2 =====");
        System.out.println("Please enter number 1?");
        int number3 = input.nextInt();
        System.out.println("Please enter number 2?");
        int number4 = input.nextInt();
        System.out.println("Please enter number 3?");
        int number5 = input.nextInt();
        System.out.println("Please enter number 4?");
        int number6 = input.nextInt();
        System.out.println("Please enter number 5?");
        int number7 = input.nextInt();
        System.out.println("Max Value =" + Math.max(Math.max(number3, number4), Math.max(Math.max(number5, number6), number7)));
        System.out.println("Min Value =" + Math.min(Math.min(number3, number4), Math.min(Math.max(number5, number6), number7)));
        System.out.println("===== TASK 3 =====");
        int myRandomBetween50to100 = (int) (Math.random() * (51));
        int myRandomBetween50to100B = (int) (Math.random() * (51) + 10);
        int myRandomBetween50to100C = (int) (Math.random() * (51) + 40);
        System.out.println("Number 1 = " + myRandomBetween50to100);
        System.out.println("Number 2 = " + myRandomBetween50to100B);
        System.out.println("Number 3 =" + myRandomBetween50to100C);
        System.out.println("The sum of numbers is = " + (myRandomBetween50to100 + myRandomBetween50to100B + myRandomBetween50to100C));
        System.out.println("===== Task 4 =====");
        double Alex = 125;
        double Mike = 220;
        double alexToMike = 25.5;
        System.out.println("Alex's money: $" + (Alex - alexToMike));
        System.out.println("Mike's money: " + (Mike + alexToMike));
        System.out.println("===== Task 5 =====");
        double priceForBicycle = 390;
        System.out.println("The price for the bicycle is = $" + priceForBicycle);
        System.out.println("How much daily is David saving?");
        double dailySave = input.nextDouble();
        System.out.println("David can buy a bicycle " + (int) (priceForBicycle / dailySave) + " days.");
        System.out.println("===== Task 6 =====");
        String s1 = "5", s2 = "10";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println("Sum of " + s1 + " and " + s2 + " is = " + (i1 + i2));
        System.out.println("Product of " + s1 + " and " + s2 + " is = " + (i1 * i2));
        System.out.println("Division of " + s1 + " and " + s2 + " is = " + (i1 / i2));
        System.out.println("Subtraction of " + s1 + " and " + s2 + " is = " + (i1 - i2));
        System.out.println("Remainder of " + s1 + " and " + s2 + " is = " + (i1 % i2));
        System.out.println("===== Task 7 =====");
        String s3 = "200", s4 = "-50";
        int i3 = Integer.parseInt(s3);
        int i4 = Integer.parseInt(s4);
        System.out.println("The greatest value is = " + Math.max(i3, i4));
        System.out.println("The smallest value is = " + Math.min(i3, i4));
        System.out.println("The average is = " + (i3 + i4) / 2);
        System.out.println("The absolute difference is = " + Math.abs(i3 - i4));
        System.out.println("===== Task 8 =====");
        double countBank = 0.96;
        double save1 = 24;
        double save2 = 168;
        int daysSaved = 150;
        System.out.println((int) (save1 / countBank) + " days");
        System.out.println((int) (save2 / countBank) + " days");
        System.out.println("$" + daysSaved * countBank);
        System.out.println("===== Taskk 9 =====");
        double priceForComputer = 1250;
        System.out.println("The price for the computer = $" + priceForComputer);
        System.out.println("How much daily is Jessie saving?");
        double dailySave2 = input.nextDouble();
        System.out.println("Jessie can buy the computer in " + (int) (priceForComputer / dailySave2) + " days.");
        System.out.println("===== Taskk 10 =====");
        double priceForNewCar = 14265;
        System.out.println("The price for the new car is = $" + priceForNewCar);
        System.out.println("Option 1, how much equal monthly payment is Dan paying?");
        double option1 = input.nextDouble();
        System.out.println("Option 2, how much equal monthly payment is Dan paying?");
        double option2 = input.nextDouble();
        System.out.println("Option 1 will take " + (int) (priceForNewCar / option1) + " months");
        System.out.println("Option 2 will take " + (int) (priceForNewCar / option2) + " months");
        System.out.println("===== Task 11 =====");
        System.out.println("Hey user, please enter a number");
        int num1 = input.nextInt();
        System.out.println("Hey user, please enter a number");
        int num2 = input.nextInt();
        System.out.println((double) num1 / (double) num2);
        System.out.println("===== Task 12 =====");
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber);
        if (randomNumber > 25) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("===== Task 13 =====");
        System.out.println("Please enter a number between 1 to 7");
        int numBetween1to7 = input.nextInt();
        if (numBetween1to7 == 1) {
            System.out.println("The number entered returns MONDAY");
        } else if (numBetween1to7 == 2) {
            System.out.println("The number entered returns TUESDAY");
        } else if (numBetween1to7 == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        } else if (numBetween1to7 == 4) {
            System.out.println("The number entered returns THURSDAY");
        } else if (numBetween1to7 == 5) {
            System.out.println("The number entered returns FRIDAY");
        } else if (numBetween1to7 == 6) {
            System.out.println("The number entered returns SATURDAY");
        } else if (numBetween1to7 == 7) {
            System.out.println("The number entered returns SUNDAY");

        }

        System.out.println("===== TASK 14 =====");
        System.out.println("Hey Jennifer!Tell me your 1st exam result");
        int examResult = input.nextInt();
        System.out.println("Hey Jennifer!Tell me your 2nd exam result");
        int examResult2 = input.nextInt();
        System.out.println("Hey Jennifer!Tell me your 3rd exam result");
        int examResult3 = input.nextInt();
        int examAverage = (examResult2 + examResult + examResult3) / 3;
        if (examAverage >= 70) {
            System.out.println("YOU PASSED!");

        } else {
            System.out.println("YOU FAILED");
        }
        System.out.println("===== TASK 15 =====");
        System.out.println("Hey user, please enter a number");
        int num3 = input.nextInt();
        System.out.println("Hey user, please enter a number");
        int num4 = input.nextInt();
        System.out.println("Hey user, please enter a number");
        int num5 = input.nextInt();
        if ((num3 == num4) && (num3== num5) && (num4==num5)){
            System.out.println("TRIPLE MATCH");
        }
        else if ((num3 != num4) && (num3!= num5) && (num4!=num5)) {
            System.out.println("NO MATCH");
        }
        else if ((num3 == num4) && (num3== num5) || (num4==num5)) {
            System.out.println("DOUBLE MATCH");
        }

        int match1,match2,match3;
        System.out.println("Please enter 3 numbers");
        match1=input.nextInt();
        match2=input.nextInt();
        match3=input.nextInt();
        if(match1== match2 && match2==match3){
            System.out.println("TRIPLE MATCH");

        }

    }
}
