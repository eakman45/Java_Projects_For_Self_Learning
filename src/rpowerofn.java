import java.util.Scanner;

public class rpowerofn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base = ");
        int k = scan.nextInt();
        System.out.println("Exponential");
        int n = scan.nextInt();

        int counter = 1;
        int total = 1;

        //3^4 = 3 * 3 * 3 * 3;

        while(counter <= n){
            total=total * k;
            counter++;
        }

        System.out.println(k+" to the power of "+n+" is = "+total);
    }
}
