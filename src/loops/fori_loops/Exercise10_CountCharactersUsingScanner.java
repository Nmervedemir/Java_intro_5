package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and count how many l letter exist in the name

        Lionel ->2
        Leo -> 1
        Lucy -> 1
         */

        String name = ScannerHelper.getAName();
        int counter = 0;
        for (int i = 0; i <= name.length() - 1 ; i ++) {
            if(name.toLowerCase().charAt(i) == 'l')
                counter ++;
        }
        System.out.println(counter);
    }

}
