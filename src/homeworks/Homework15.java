package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        System.out.println(Arrays.toString(fibonacciSeries1(5)));

        System.out.println("===== Task 2 =====");
        System.out.println(fibonacciSeries2(8));

        System.out.println("===== Task 3 =====");
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));

        System.out.println("===== Task 4 =====");
        System.out.println(isPowerOf3(27));

        System.out.println("===== Task 5 =====");
        int[] arr5_4 = {1, 3, 3, 4, 5, 1};
        System.out.println(firstDuplicate(arr5_4));




    }
    public static int[] fibonacciSeries1(int num){
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;

        int firstTerm =  0;
        int secondTerm = 1;

        for (int i = 2; i < num; i++) {
            int nextTerm = firstTerm + secondTerm;
            arr[i] = nextTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return arr;
    }

    public static int fibonacciSeries2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        for (int i = 3; i <= n; i++) {
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return nextNumber;
    }

    public static int[] findUniques(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int element : a) {
            listA.add(element);
        }
        for (int element : b) {
            listB.add(element);
        }



        for (int i = 0; i < listA.size(); i++) {
            if (!list.contains(listA.get(i)) && !listB.contains(listA.get(i))) list.add(listA.get(i));
        }
        for (int i = 0; i < listB.size(); i++) {
            if (!list.contains(listB.get(i)) && !listA.contains(listB.get(i))) list.add(listB.get(i));
        }
        int[] uniques = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniques[i] = list.get(i);
        }
        return uniques;
    }

    public static boolean isPowerOf3(int number){
        int power = 3;
        while(power < number){
            power = power * 3;
        }
        return power == number;
    }

    public static int firstDuplicate(int[] arr){
        int duplicate = -1;
        int iOfDuplicate = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && j < iOfDuplicate) {
                    duplicate = arr[i];
                    iOfDuplicate = j;
                }
            }
        }
        return duplicate;
    }
}
