import java.util.Scanner;

public class recursivePrime {
    static boolean isPrime(int n, int i) {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = myNum.nextInt();

        if (isPrime(n, 2))
            System.out.println(n+" is a PRIME number !");
        else
            System.out.println(n+" is NOT a PRIME number !");
    }
}
