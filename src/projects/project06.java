package projects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class project06 {
    public static void main(String[] args) {
        System.out.println("=======Task1=======");
        String[] words = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(words));

        System.out.println("=======Task2=======");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(-10);
        numbers.add(-78);
        numbers.add(0);
        numbers.add(15);
        System.out.println(removeNegatives(numbers));

        System.out.println("=======Task3=======");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String str = scanner.nextLine();
        char p[] = str.toCharArray();
        System.out.println(validatePassword(p));

        System.out.println("=======Task4=======");
        System.out.println("Please enter valid e-mail");
        Scanner scan = new Scanner (System.in);
        String email = scan.nextLine();
        System.out.println(validateEmailAddress(email));






    }




    public static int countMultipleWords(String[] arr) {

        Pattern pattern = Pattern.compile("(?i)\\b[a-z]+\\b");

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            Matcher matcher = pattern.matcher(arr[i]);
            int temp = 0;

            while(matcher.find()) {
                temp++;
            }

            if(temp > 1) count++;
        }

        return count;
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer>numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            Integer number =iterator.next();
            if(number<0){
                iterator.remove();
            }
        }
        return numbers;
    }
    public static String validatePassword(char p[]) {
        int counter = 0;
        if(p.length < 6 || p.length > 20){
            return "false";
        }
        for(int i = 0 ; i < p.length ; i++){
            if(p[i] == '@' || p[i] == '#' || p[i] == '$'|| p[i] == '0' || p[i] == '1' || p[i] == '2' || p[i] == '3' || p[i] == '4' || p[i] == '5' || p[i] == '6'|| p[i] == '7'|| p[i] == '8'|| p[i] == '9'){
                counter = 0;
                break;
            }
            counter = 1;
            if(counter == 1){
                return "false";
            }
        }
        return "true";
    }
    public static boolean validateEmailAddress (String email){
        return Pattern.matches("[\\S][a-zA-Z]{2,}@[a-zA-Z]{2,}.[a-zA-Z]{2,}", email);
    }

}
