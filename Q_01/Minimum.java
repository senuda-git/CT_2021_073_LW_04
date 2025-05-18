package Q_01;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //User inputs for 3 integers
        System.out.println("Enter Your First Integer : ");
        int num1 = scan.nextInt();

        System.out.println("Enter Your Second Integer : ");
        int num2 = scan.nextInt();

        System.out.println("Enter Your Third Integer : ");
        int num3 = scan.nextInt();

        //set minimun value to num1
        int min = num1;

        //find minimum value
        if (num2 < min){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }

        //Display minimum value
        System.out.println("Minimum Value : "+ min);
    }
}