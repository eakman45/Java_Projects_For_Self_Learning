import java.util.Scanner;

public class recursiveFibonnaci {
    static int fib(int number) {
        if (number > 0) {
            if (number == 1 || number == 2) {
                return 1;
            }
            return fib(number - 1) + fib(number - 2);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the n.th step to see the fibonnaci sum :");

        int sum= input.nextInt();

        System.out.println(fib(sum));
    }
}
