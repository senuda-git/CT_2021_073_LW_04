package Q_04;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.println("Enter a year : ");
        int year = scanner.nextInt();
        boolean isLeapYear = true;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
