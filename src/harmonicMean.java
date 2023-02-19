
import java.util.Scanner;

public class harmonicMean {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = myInput.nextInt();
        double fracresult=0.0;

        for (int i =1;i<=n;i++){
            fracresult += (1.0/i);
        }
        System.out.println("Harmonic mean of your input is = ");
        System.out.println(fracresult);


    }
}
