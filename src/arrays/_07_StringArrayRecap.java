package arrays;

import com.sun.prism.shader.AlphaOne_RadialGradient_AlphaTest_Loader;

import java.util.Arrays;

public class _07_StringArrayRecap {
    public static void main(String[] args) {
        // Create Strinf array w the length of 4 (new way NOT with curly brackets)

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));

        //assing "Apple" to index of 0
        //assing "KIWI to index of 3
        //

        fruits[0]= "Apple";
        fruits[3]= "Kiwi" ;
        System.out.println(Arrays.toString(fruits));

        fruits[1]= "Grapes";
        fruits[2]= "Orange";
        System.out.println(Arrays.toString((fruits)));

        System.out.println("\n Reassigning values:");

        // Reassing "Apple" to index of 3 and to index of 2
        // ["Apple", "Grapes", "Orange", "Kiwi"] ->
        // ["Apple", "Grapes", "Apple", "Apple"]

        fruits[3] = fruits[0];
        fruits[2]= fruits[0];

        System.out.println(Arrays.toString(fruits));

        /*
        for(DataTyoe Name : arrayName){
         -> code to be execute
         }
         */

        System.out.println(("\nPrinting values with for each loop:"));

        for(String singleFruit : fruits){
            System.out.println(singleFruit);
        }







    }
}
