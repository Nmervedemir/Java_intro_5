package loops;

import utilities.ScannerHelper;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from user
        Reverse the name and print it back
        
        Test data;
        James

        Expected output:
        semaJ

        Test data;
        John

        Expected output;
        nhoJ
          */

      String name= ScannerHelper.getAName();


       String reversedName = "" ;

        for (int i = name.length() -1 ; i >= 0; i--) {
            reversedName += name.charAt(i);
            
        }
        System.out.println("The reversed name is = " + reversedName);


    }
}
