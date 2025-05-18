package Q_03;

import java.util.Scanner;

public class PowerOf10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.println("Enter the power of 10 : ");
        int power = scanner.nextInt();
        String alert;

        //switch statement
        switch (power){
            case 6:
                alert="Million";
                break;
            case 9:
                alert="Billion";
                break;
            case 12:
                alert="Trillion";
                break;
            case 15:
                alert="Quadrillion";
                break;
            case 18:
                alert="Quintillion";
                break;
            case 21:
                alert="Sextillion";
                break;
            case 30:
                alert="Nonillion";
                break;
            case 100:
                alert="Googol";
                break;
            default:
                alert = null;
                break;
        }

        if (alert == null) {
            System.out.println("Invalid power selection");
        } else {
            System.out.println("You selected: " + alert);
        }
    }
}
