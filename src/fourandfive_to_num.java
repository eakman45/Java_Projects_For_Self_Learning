import java.util.Scanner;

public class fourandfive_to_num {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number = ");
        num= input.nextInt();

        //for printing out powers of four smaller than input
        System.out.println("Power of 4");
        for(int i =0;i<=num;i++){
            if(Math.pow(4,i)<num){
                System.out.print(Math.pow(4,i)+",");
            }
        }
        System.out.println();

        System.out.println("Power of 5");
        //for printing out powers of five smaller than input
        for (int j =0;j<=num;j++){
            if(Math.pow(5,j)<num){
                System.out.print(Math.pow(5,j)+",");
            }
        }
    }
}
