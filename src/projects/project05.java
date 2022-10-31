package projects;

import java.util.Arrays;

import static arrays._13_SecondGreatest_SecondSmallest.findMax;

public class project05 {
    public static void main(String[] args) {
        System.out.println("=======Task1=======");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(numbers);
        System.out.println("=======Task2=======");





        System.out.println("=======Task3=======");
        int[] numbers1 ={10, 5, 6, 7, 8, 5, 15, 15};

        System.out.println("=======Task 4=======");
        findSecondGreatestAndSmallest(numbers1);





    }




    private static void findGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }
    private static void findSecondGreatestAndSmallestWithSort(int[] numbers1) {
        Arrays.sort(numbers1);
        System.out.println("Second Smallest = " + numbers1[1]);
        System.out.println("Second Greatest = " + numbers1[numbers1.length - 2]);
    }


    private static void findSecondGreatestAndSmallest(int[] numbers1) {




    }
    }














