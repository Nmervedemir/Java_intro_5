package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        /*
    Declare a String and store a name in it
    Declare different Strings and store the names of your best  friends
    in them
    Declare different Strings and store the names of all your friends in them
         */

        //Storing a name in a String
        String name = "James"; // that holds a single name

        String[] names = {"Beyza", "Andrii", "Vlad", "Samir", "Olena"}; //holding a collection of name

        //Retrieving an element from an array-using index

        System.out.println(names[2]);//Vlad
        System.out.println(names[4]);//Olena

        //ArrayIndexOutofBoundsException 0-4
        //System.out.println(names[5]);
        //System.out.println(names[-1]);

        int age = 25;
        int[] ages = {21,23,24};

        System.out.println(ages[2]); // 25

    }
}
