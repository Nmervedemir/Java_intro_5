package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c[] = str.toCharArray();
        System.out.println(validatePassword(c));


    }

    public static String validatePassword(char c[]) {
        int counter = 0;
        if(c.length < 6 || c.length > 20){
            return "Invalid";
        }
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] == '@' || c[i] == '#' || c[i] == '$'|| c[i] == '0' || c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' || c[i] == '6'|| c[i] == '7'|| c[i] == '8'|| c[i] == '9'){
                counter = 0;
                break;
            }
            counter = 1;
            if(counter == 1){
                return "Invalid";
            }
        }
        return "Valid";
    }

}