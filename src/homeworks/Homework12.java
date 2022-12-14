package homeworks;

import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        String str = "123Hello World149";
        System.out.println(noDigit(str));

        System.out.println("===== Task 2 =====");
        String str1 = "JAVA";
        System.out.println(noVowel(str1));

        System.out.println("===== Task 3 =====");
        String str2 = "Java123";
        System.out.println(sumOfDigits(str2));

        System.out.println("===== Task 4 =====");
        String str3 = "java";
        System.out.println(hasUpperCase(str3));

        System.out.println("===== Task 5 =====");
        System.out.println(middleInt(5, 5, 8));

        System.out.println("===== Task 6=====");
        int[] number={13,13,13};
        System.out.println(Arrays.toString(no13(number)));

        System.out.println("===== Task 7 =====");
        int[] numbers={5,0,6};
        System.out.println(Arrays.toString(arrFactorial(numbers)));

        System.out.println("===== Task 8 =====");

        str3 = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(str3)));

    }

    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");

    }

    public static String noVowel(String str1) {
        return str1.replaceAll("[aeiouAEIOU]", "");

    }

    public static int sumOfDigits(String str2) {
        int sum = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isDigit(str2.charAt(i)))
                sum += Integer.parseInt(str2.substring(i, i + 1));

        }

        return sum;
    }

    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                return true;

        }

        return false;
    }

    public static int middleInt(int num1, int num2, int num3) {
        int[] arr = {num1, num2, num3};
        return arr[1];
    }

    public static int[] no13(int[] number){
        for (int i = 0; i < number.length ; i++) {
            if(number[i] == 13 ) number[i] =0;

        }
        return number;
    }


    public static int[] arrFactorial (int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] == 0) numbers[i] = 1;
            else{
                int factorial = 1;
                for (int j = 1; j <= numbers[i]; j++) {
                    factorial *= j;
                }
                numbers[i] = factorial;
            }
        }
        return numbers;
    }

    public static String[] categorizeCharacters(String str3){

            String[] arr = {"","",""};
            for (int i = 0; i < str3.length(); i++) {
                if (str3.charAt(i) == ' ') return arr;
                if(Character.isLetter(str3.charAt(i))) arr[0] += str3.charAt(i);
                else if(Character.isDigit(str3.charAt(i))) arr[1] += str3.charAt(i);
                else arr[2] += str3.charAt(i);
            }
            return arr;
        }
            
        }

        




