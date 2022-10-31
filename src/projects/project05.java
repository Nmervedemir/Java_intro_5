package projects;

import java.util.Arrays;



public class  project05 {
    public static void main(String[] args) {
        System.out.println("=======Task1=======");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(numbers);

        System.out.println("=======Task2=======");
        numbers = new int[]{10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallest(numbers);


        System.out.println("=======Task3=======");
        int[] numbers1 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numbers1);

        System.out.println("=======Task 4=======");
        int[] numbers2 = new int[]{10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(numbers2);

        System.out.println("=======Task 5=======");
        String[] elements = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(elements);

        System.out.println("=======Task 6=======");
        String[] elements2 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(elements2);







    }


    public static void findGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }

    public static void findGreatestAndSmallest(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max)
                max = number;
            if (number < min)
                min = number;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    public static void findSecondGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int secondMin = 0;
        int secondMax = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != min) {
                secondMin = numbers[i];
                break;
            }
        }
        for (int i = numbers.length - 2; i > 0; i--) {
            if (numbers[i] != max) {
                secondMax = numbers[i];
                break;
            }
        }
        System.out.println("Second smallest = " + secondMin);
        System.out.println("Second greatest = " + secondMax);
    }
    public static void findSecondGreatestAndSmallest (int[] numbers){

        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) max = number;
        }

        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) min = number;
        }

        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > secondMax && number < max){
                secondMax = number;
            }
            if (number < secondMin && number > min){
                secondMin = number;
            }
        }
        System.out.println("Second smallest = " + secondMin);
        System.out.println("Second greatest = " + secondMax);
    }

    public static void findDuplicatedElementsInAnArray (String[] elements){
        for (int i = 0; i < elements.length; i++){
            for(int j = i +1; j < elements.length; j++){
                if (elements[i].equals(elements[j]))
                    System.out.println(elements[j]);
            }
        }

    }

    public static void findMostRepeatedElementInAnArray (String[] elements){

        int maxCount = 0;
        String mostRepeated = "";
        for (int i = 0; i < elements.length; i++){
            int count = 0;
            for (int j = 0; j < elements.length; j++){
                if (elements[i].equals(elements[j])) {
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                mostRepeated = elements[i];
            }
        }
        System.out.println(mostRepeated);
    }


}
















