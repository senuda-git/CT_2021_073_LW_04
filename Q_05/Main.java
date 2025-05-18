package Q_05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        System.out.println(" Welcome to Lo-Fat Burgers !!!");
        System.out.println();

        while (true) {
            //Choosing category
            System.out.println("Food Categories:");
            System.out.println("1. Entrees");
            System.out.println("2. Side Dishes");
            System.out.println("3. Drinks");
            System.out.println();
            System.out.print("Enter the food category number: ");
            int category = input.nextInt();

            switch (category) {
                case 1:
                    displayEntreeMenu();
                    break;
                case 2:
                    displaySideDishMenu();
                    break;
                case 3:
                    displayDrinkMenu();
                    break;
                default:
                    System.out.println("Invalid Category Selection\n");
                    continue;
            }

            //Choosing items within category
            System.out.println();
            System.out.print("Enter the food item number: ");
            int item = input.nextInt();
            double price;
                price = (category == 1) ? getEntreePrice(item)
                    : (category == 2) ? getSideDishPrice(item)
                    : getDrinkPrice(item);

            if (price < 0) {
                System.out.println("Invalid Item Selection\n");
            } else {
                System.out.printf("Item added");
                total += price;
            }

            //Adding another step
            System.out.print("Add another? (Yes - Any key / 0 - No): ");
            if (input.next().equals("0")) {
                break;
            }
            System.out.println();
        }

        //Printing total bill
        System.out.println();
        System.out.println("--------------------------------");
        System.out.printf("Your total is: $%.2f%n", total);
        System.out.println("Thank you for ordering at Lo-Fat Burgers!");
        input.close();
    }

    //to display entree menu
    public static void displayEntreeMenu() {
        System.out.println();
        System.out.println(" Entree Menu");
        System.out.println("01. Tofu Burger             $ 3.49");
        System.out.println("02. Cajun Chicken           $ 4.59");
        System.out.println("03. Buffalo Wings           $ 3.99");
        System.out.println("04. Rainbow Fillet          $ 2.99");
    }

    //to display side dish menu
    public static void displaySideDishMenu() {
        System.out.println();
        System.out.println(" Side Dish Menu");
        System.out.println("01. Rice Cracker            $ 0.79");
        System.out.println("02. No-Salt Fries           $ 0.69");
        System.out.println("03. Zucchini                $ 1.09");
        System.out.println("04. Brown Rice              $ 0.59");
    }

    //to display drink menu
    public static void displayDrinkMenu() {
        System.out.println();
        System.out.println(" Drink Menu");
        System.out.println("01. Cafe Mocha              $ 1.99");
        System.out.println("02. Cafe Latte              $ 1.90");
        System.out.println("03. Espresso                $ 2.49");
        System.out.println("04. Oolong Tea              $ 0.99");
    }

    //to get entree price
    public static double getEntreePrice(int choice) {
        switch (choice) {
            case 1: return 3.49;
            case 2: return 4.59;
            case 3: return 3.99;
            case 4: return 2.99;
            default: return -1;
        }
    }

    //to get side dish price
    public static double getSideDishPrice(int choice) {
        switch (choice) {
            case 1: return 0.79;
            case 2: return 0.69;
            case 3: return 1.09;
            case 4: return 0.59;
            default: return -1;
        }
    }

    //to get drink price
    public static double getDrinkPrice(int choice) {
        switch (choice) {
            case 1: return 1.99;
            case 2: return 1.90;
            case 3: return 2.49;
            case 4: return 0.99;
            default: return -1;
        }
    }
}
