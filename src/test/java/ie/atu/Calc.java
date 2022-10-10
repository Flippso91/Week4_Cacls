package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

    add delete();
    }
    //this method takes in a values and subtraced them
    public static void delete() {
        System.out.println("The numbers you enter will be subtracted");

    multiple();
    }
    //this method takes in a values and multiply together
    public static void multiple() {
        System.out.println("The numbers you enter will be multiplied together");

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("You entered: " + firstNumber);
        System.out.println("please enter another number");
        int secondNumber = input.nextInt();
        System.out.println("You entered: " + secondNumber);

        int total = firstNumber - secondNumber;
        System.out.println("when subtraced the answer is:" + total);

        int total = firstNumber * secondNumber;
        System.out.println("when multiplied the total is:" + total);

        //

        public static void main(String[] args)
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







