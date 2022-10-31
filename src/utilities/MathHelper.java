package utilities;

public class MathHelper {


    /*
   Write a method that returns the max of 3 int numbers

     */
    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);

    }

    /*
 Write a method that returns the max of 3 int numbers

   */
    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

      /*
      Write a method that returns middle number of 3 int numbers
      Assume number can never equal to each other
       */

    public static int middleOfThree(int num1, int num2, int num3) {
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);

        /*if(num1 != min && num1 != max ) return num1;
        else if ( num2 != min && num2 != max) return num2;
        else return num3;
         */
        return num1 + num2 + num3 - min - max;

    }

    /*
    Please create a method that takes an int as an argument and returns true if it is even
    returns false if it is odd

    return type
    returns boolean
    static
    public
    takes an int as arg
    method name = isEven
    long way
     */

    public static boolean isEven(int num) {
        if (num % 2 == 0) return true;
        else return false;
    }

     /*
    Please create a method that takes an int as an argument and returns true if it is odd
    returns false if it is even
    return type
    returns boolean
    static
    public
    takes an int as arg
    method name = isEven
    Shorty way
     */


    public static boolean isOdd(int num) {
        return num % 2 == 1;
    }

    /*
    Create a method that takes 2 int argument and returns their sum Method name = sum

    public static
    return type
    return int
    it takes 2 ints

   */

     public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //OVERLOADING A METHOD

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2 ;
    }

    public static long sum(long num1, long num2) {
        return num1 + num2 ;
    }

    public static int sum(byte num1, int num2) {
        return num1 + num2 ;
    }

}






