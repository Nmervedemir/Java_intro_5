package date_time;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        /*
        Ask user to enter there age and find their year of birth
         */

        int age= ScannerHelper. getAnAge();

        System.out.println(LocalDate.now(). getYear()- age);
        System.out.println((Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date() )) - age)); // 2022


        /*
        Ask user to enter their year of birth
        Calculate their age
        currentYear - YearOfBirth
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date of year");

        int dateOfYear = scanner.nextInt();

        System.out.println(LocalDate.now().getYear() - dateOfYear);
    }
}
