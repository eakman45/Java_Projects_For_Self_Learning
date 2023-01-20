import java.util.Scanner;

public class untilOdd {
    public static void main(String[] args) {
        int num;
        int sum=0;
        Scanner inp = new Scanner(System.in);


        do{
            System.out.println("Please enter a number:");
            num = inp.nextInt();
            //to check our input is a multiple of 4
            if(num % 4 ==0){
                sum = sum+num;
            }
        //to end our loop if given input is odd
        }while (num % 2==0);

        System.out.println("Sum of our inputs is = ");
        System.out.println(sum);
    }
}
