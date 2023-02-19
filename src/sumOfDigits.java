import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner myInput= new Scanner(System.in);
        System.out.println("Enter a number :");
        int myNum= myInput.nextInt();
        int tempValue;
        int digitValues,result=0;

        tempValue=myNum;
        while(tempValue != 0){
            digitValues= tempValue % 10;
            result+=digitValues;
            tempValue /= 10;
        }
        System.out.print("Sum of the digit values of given number is = ");
        System.out.println(result);
    }

}