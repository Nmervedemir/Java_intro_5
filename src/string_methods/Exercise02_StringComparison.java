package string_methods;

public class Exercise02_StringComparison {

    public static void main(String[] args) {
        /*
        In this task, we will learn differetn ways of ignoring cases
        Assume that you are given below Strings

        JAVA
        java

        Compare this 2 strings and get true
         */


        String str1 = "JAVA";
        String str2 = "java";

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.toLowerCase().equals(str2)); // true
        System.out.println(str1.equals(str2.toUpperCase())); // true


    }


}
