import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.println("Please enter how many steps of fibonacci series you want to see : ");
        int steps=myInput.nextInt();
        int first=0;
        int second=1;
        int currentvalue;

        System.out.print(first+" "+second+" ");

        for (int i=2;i<=steps;i++){

                currentvalue = second+first;
                first = second;
                second = currentvalue;
                System.out.print(currentvalue+" ");

        }


    }
}
