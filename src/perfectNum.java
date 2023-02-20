import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number :");
        int number= input.nextInt();
        int sumOfDividents=0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                sumOfDividents+=i;
            }

        }

        if(sumOfDividents==number){
            System.out.println(number+" is a perfect number.");
        }
        else{
            System.out.println(number+" is not a perfect number.");
        }
    }
}
