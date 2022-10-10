package ie.atu;

import java.util.Scanner;

public class Calc {

        public static void main(String[] args) {
            add();

        }

        public static void add()
        {
            System.out.println("Calculator startup");
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter a number ");
            Scanner inputs = new Scanner(System.in);
            int firstNumber = input.nextInt();

            System.out.println("Please enter a second number ");
            int secondNumber = input.nextInt();

            int totalvalue =firstNumber + secondNumber;
            System.out.println("Total amounts to  : " +totalvalue);


        }
    }








}
