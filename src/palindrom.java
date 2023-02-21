import java.util.Scanner;

public class palindrom {
    static boolean isPalindrom(int number){

        int temp=number,reverseNumber=0,lastDecimal;
        while(temp != 0){
            //To get the last digit of the number:
            lastDecimal = temp % 10;
            /*
            Using reverse number we can reverse the entered number.
            */
            reverseNumber = (reverseNumber*10)+lastDecimal;
            //to remove last digit.
            temp /= 10;
        }
        return reverseNumber == number;
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int n= myInput.nextInt();
        System.out.println(isPalindrom(n));

    }
}
