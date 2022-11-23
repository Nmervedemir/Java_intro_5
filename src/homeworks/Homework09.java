package homeworks;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework09 {
    public static <Arraylist> void main(String[] args) {

        System.out.println("===== Task 1 =====");

        int[] numbers= {3, 4, 3, 3, 5, 5, 6, 6, 7};

        ArrayList<Integer> task1 = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    task1.add(numbers[j]);
            }

        }
        if (task1.size() > 0) System.out.println(task1.get(0));
        else System.out.println("There is no duplicates");

        System.out.println("===== Task 2 =====");

        String[] words = {"a","b",  "B", "XYZ", "123" };
        ArrayList<String> task2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length ; j++) {
                if(words[i].equals(words[j].toLowerCase()))
                    task2.add(words[i]);
            }
        }if (task2.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(task2.get(0));

        System.out.println("===== Task 3 =====");

        int[] num= {0, -4, -7, 0, 5, 10, 45, -7, 0};

        ArrayList<Integer> task3 = new ArrayList<>();
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j] && !task3.contains(num[i])) {
                    task3.add(num[i]);

                }
            }
        }
        if (task3.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer n : task3) System.out.println(n);

        System.out.println("===== Task 4 =====");
        String[] word = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        ArrayList<String> task4 = new ArrayList<>();
        for (int i = 0; i < word.length ; i++){
            for(int j = i + 1; j < word.length; j++){
                if (word[i].equalsIgnoreCase(word[j]) && !task4.contains(word[i].toUpperCase())){
                    task4.add(word[i]);

                }
            }
        }
        if (task4.isEmpty()) System.out.println("There is no duplicates");
        else for (String s : task4) {
            System.out.println(s);
        }


        System.out.println("===== Task 5 =====");

        String[] words1 = {"abc", "foo", "bar"};
        for (int i = words1.length - 1; i >= 0; i--){
            System.out.println(words1[i]);
        }

        System.out.println("===== Task 6 =====");

        String str = "Java is fun";
        ArrayList<String> words6 = new ArrayList<>(Arrays.asList(str.split(" ")));

        for (String s : words6) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.print(sb + " ");
        }

    }
}




















