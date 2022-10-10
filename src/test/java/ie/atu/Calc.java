package ie.atu;

public class Calc {
    public static void main(String[] args) {
    add delete();
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
        int total = firstNumber - secondNumber;
        System.out.println("when subtraced the answer is:" + total);

    }
}
