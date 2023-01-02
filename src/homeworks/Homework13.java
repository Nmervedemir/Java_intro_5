package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        System.out.println(hasLowerCase("123$"));

        System.out.println("===== Task 2 =====");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 10));
        System.out.println(noZero(numbers));

        System.out.println("===== Task 3 =====");
        int[] numberSquare3 = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(numberSquare3)));

        System.out.println("===== Task 4 =====");
        String[] strtask4 = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue(strtask4, "123"));

        System.out.println("===== Task 5 =====");
        System.out.println(reverseSentence("Java is fun"));

        System.out.println("===== Task 6 =====");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));

        System.out.println("===== Task 7 =====");
        String[] arrTask7 = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arrTask7)));

        System.out.println("===== Task 8 =====");
        ArrayList<String> rTask8 = new ArrayList<>(Arrays.asList("Java", "C#", "C#"));
        ArrayList<String> rrTask8 = new ArrayList<>(Arrays.asList("Phyton", "C#", "C++"));
        System.out.println(removeAndReturnCommons(rTask8, rrTask8));

        System.out.println(" ====== Task 9 ====== ");
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyXyxy, Xx, ABC"))));
    }


    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i)))
                return true;
        }
        return false;
    }

    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        ArrayList<Integer> noZero = new ArrayList<>();
        for (int number : numbers){
            if(number != 0) noZero.add(number);
        }
        return noZero;
    }
    public static int[][] numberAndSquare(int[] numbers) {
        int[][] numberSquare = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            numberSquare[i][0] = numbers[i];
            numberSquare[i][1] = numbers[i] * numbers[i];
        }
        return numberSquare;
    }

    public static boolean containsValue(String[] strings, String str) {
        for (String string : strings) {
            if (string.equals(str)) return true;
        }
        return false;
    }

    public static String reverseSentence(String str) {
        String[] words = str.trim().replaceAll("\\s+", " ").split(" ");
        String reverseSentence = "";
        if (words.length == 0 || words.length == 1) {
            return "There is not enough words!";
        }
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i] + " ";
        }
        return reverseSentence;
    }

    public static String removeStringSpecialsDigits(String str) {
        String removeSpecialsDigits = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ')
                removeSpecialsDigits += str.charAt(i);
        }
        return removeSpecialsDigits;
    }

    public static String[] removeArraySpecialsDigits(String[] arr) {
        String removeArrSD = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^A-Za-z]", "");
        }
        return arr;

    }

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2) {
        ArrayList<String> newArrayList = new ArrayList<>();
        for (int i = 0; i < str1.size(); i++) {
            for (int j = 0; j < str2.size(); j++) {
                if (str1.get(i).equals(str2.get(j)) && !newArrayList.contains(str2.get(j)))
                    newArrayList.add(str2.get(j));
            }
        }
        return newArrayList;
    }

    public static ArrayList<String> noXInVariables(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replaceAll("[Xx]+", ""));
        }
        list.removeIf(x -> x.equals(""));
        return list;
    }




}
