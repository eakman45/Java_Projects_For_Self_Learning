import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter number of steps :");
        int num = myInput.nextInt();
        String x = "*";

        for (int i =num; i >= 0; i--) {
            for(int j=(num-i);j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print(x);
            }
            System.out.println();

        }
    }
}
