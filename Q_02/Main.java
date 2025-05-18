package Q_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Color Choices
        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println(" ");

        //User Input
        System.out.println("Select a number from (0 - 4) and get a color:");
        int selection = scanner.nextInt();
        String colorChoice;

        //switch statement
        switch (selection) {
            case 0:
                colorChoice = "Magenta";
                break;
            case 1:
                colorChoice = "Cyan";
                break;
            case 2:
                colorChoice = "Red";
                break;
            case 3:
                colorChoice = "Blue";
                break;
            case 4:
                colorChoice = "Green";
                break;
            default:
                colorChoice = null;
                break;
        }

        if (colorChoice == null){
            System.out.println("Invalid Color Choice Selected!");
        }else {
            System.out.println("You selected : " + colorChoice);
        }

    }
}
