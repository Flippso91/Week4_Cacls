package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        add();
        delete();
        multiple();

    }
    //this method takes in a values and subtraced them
    public static void delete() {
        System.out.println("The numbers you enter will be subtracted");
        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("You entered: " + firstNumber);
        System.out.println("please enter another number");
        int secondNumber = input.nextInt();
        System.out.println("You entered: " + secondNumber);

        int totalDel = firstNumber - secondNumber;
        System.out.println("when subtraced the answer is:" + totalDel);

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

        int totalMult = firstNumber * secondNumber;
        System.out.println("when multiplied the total is:" + totalMult);

        //
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







