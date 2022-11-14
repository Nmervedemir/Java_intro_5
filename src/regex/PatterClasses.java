package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatterClasses {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern);//returns the pattern
        System.out.println(pattern.pattern());//returns the pattern as a strin
        System.out.println(pattern.toString()); // returns the pattern as a string

        System.out.println(Pattern.matches(pattern.pattern(),"Apple"));//false

        Pattern patterns = Pattern.compile("Apple");

        System.out.println(Pattern.matches(pattern.pattern(),"Apple".toLowerCase()));//true

        String str= "I go to school at TechGlobal and i love it";

        String[] arr = str.split("[a-z0-9]{5,10}");
        System.out.println(Arrays.toString(arr));

        System.out.println("==========Ex1=========");

        String username= ScannerHelper.getAName();

        pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");

        if(Pattern.matches(pattern.toString(), username)) System.out.println("Valid UserName");
        else System.out.println("Error!Username must be 5 to 10 characters long and can only contain letters and numbers");



    }
}
