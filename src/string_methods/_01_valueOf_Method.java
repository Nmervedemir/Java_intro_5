package string_methods;

public class _01_valueOf_Method {
    public static void main(String[] args) {
        int num = 125;
        /*
   1. return type
   2. returns a String
    3. static
4. takes arguments - there are many overloaded valueOf() methods
 */

        String numString = String.valueOf(num);

        System.out.println(num + 5); // 125 + 5 -> 130
        System.out.println(numString + 5); // 125 + 5 -> 1255
    }
}
