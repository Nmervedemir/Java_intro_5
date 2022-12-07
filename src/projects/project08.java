package projects;

import java.util.Arrays;

public class project08 {
    public static void main(String[] args) {

        System.out.println("=======Task1=======");
        int[] numbers = {10,-5,20,50,100};
        System.out.println(findClosestDistance(numbers));

        System.out.println("=======Task2=======");
        int[] number = {5,3,-1,3,5,7,-1};
        System.out.println(findSingleNumber(number));

        System.out.println("=======Task3=======");
        String str = "abc abc d";
        System.out.println(findFirstUniqueCharacter(str));

        System.out.println("=======Task4=======");
        int[] array = {2,3,1,5};
        System.out.println(findMissingNumber(array));



    }

    public static int findClosestDistance(int[] numbers) {
        int closestDistance = Integer.MAX_VALUE;
        if (numbers.length < 1)
            return closestDistance = -1;
        else
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (Math.abs(numbers[i]  - numbers[j]) < closestDistance)
                        closestDistance = Math.abs(numbers[i]  - numbers[j]);
                }

            }
        return closestDistance;
    }

    public static int findSingleNumber(int[] numbers){
        int singleValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] != numbers[j])
                    singleValue = numbers[i];
            }
        }
        return singleValue;
    }

    public static char findFirstUniqueCharacter(String s) {
        while(s.length() > 0) {
            // if the character we're looking at, exists in the rest of the string
            // remove all instances of that character, else return character
            if (s.length() == 1) return s.charAt(0);
            if (!s.substring(1).contains("" + s.charAt(0))) return s.charAt(0);
            else s = s.replaceAll("" + s.charAt(0), "");
        }
        return ' ';
    }

    public static int  findMissingNumber(int[] array){
        Arrays.sort(array);
        int missingNum= 0;

        for (int i = 0; i < array.length-1 ; i++) {
            if (Math.abs(array[i] - array[i+1])!=1){
                 missingNum=array[i]+1;
            }
        }
         return missingNum;


    }
}