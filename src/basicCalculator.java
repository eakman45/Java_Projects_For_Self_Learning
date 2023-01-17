import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        int number1, number2, select;
        //Taking input for first number in our calculation.
        System.out.println("Enter the first number = ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        System.out.println("Enter the second number = ");
        number2 = input.nextInt();


        //Taking the operation
        System.out.println("1-Sum\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("Your Selection = ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Your result = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Your result = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Your result = " + (number1 * number2));
                break;
            case 4:
                System.out.println("Your result = " + (number1 / number2));
                break;

            default:
                System.out.println("Enter a valid operand!");

        }
    }
}