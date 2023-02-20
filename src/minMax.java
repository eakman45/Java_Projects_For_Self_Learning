
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {

        int max =0;
        int min=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the count of numbers to be entered.");
        int total= input.nextInt();

        for(int i=1;i<=total;i++){
            System.out.println(i+". number = ");
            int number = input.nextInt();

            if (i==1){
                max=number;
                min=number;
            }
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }


        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
