package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        System.out.println(countWords("     Java is fun       "));

        System.out.println("===== Task 2 =====");
        System.out.println(countA("TechGlobal is a QA bootcamp"));

        System.out.println("===== Task 3  =====");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers));

        System.out.println("===== Task 4  =====");
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(number));

        System.out.println("===== Task 5  =====");
        ArrayList<String> str = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(str));

        System.out.println("===== Task 6 =====");
        String str6 = "Java  is fun    ";
        System.out.println(removeExtraSpaces(str6));

        System.out.println("===== Task 7  =====");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("===== Task 8  =====");

        int[] numbersTask8 = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(numbersTask8));
    }





    public static int countWords(String s) {
        String[] words = s.trim().split(" ");
        return words.length;
    }

    public static int countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') count++;
        }
        return count;
    }

    public static int countPos(ArrayList<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (number > 0) count++;
        }
        return count;

    }

  public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> number){
        ArrayList<Integer> dub = new ArrayList<>();
      for (Integer integer : number) {
          if(!dub.contains(integer)) dub.add(integer);

      }
        return dub;
      }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> strs){
        ArrayList<String> noDups = new ArrayList<>();
        for (String str : strs) {
            if(!noDups.contains(str))noDups.add(str);
        }
            return noDups;
        }

        public static String removeExtraSpaces(String str){
            return str.replaceAll("\\s+", " ").trim();

    }
    public static int[] add(int[] numbers1, int[] numbers2){
        int[] sum;
        if (numbers1.length > numbers2.length){
            for (int i = 0; i < numbers2.length; i++){
                numbers1[i] = numbers1[i] + numbers2[i];
            }
            sum = numbers1;
        }
        else {
            for (int i = 0; i < numbers1.length; i++){
                numbers2[i] = numbers1[i] + numbers2[i];
            }
            sum = numbers2;
        }
        return sum;
    }

    public static int findClosestTo10(int[] numbers) {
        int difference = Integer.MAX_VALUE;
        int closest = 0;
        for (int number : numbers) {
            if (Math.abs(10 - number) <= difference && number != 10) {
                if (difference == Math.abs(10 - number)) {
                    closest = Math.min(closest, number);
                } else {
                    difference = Math.abs(10 - number);
                    closest = number;
                }
            }
        }
        return closest;
    }


}


