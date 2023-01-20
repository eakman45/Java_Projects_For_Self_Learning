import java.util.Scanner;

public class rpowerofn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base = ");
        int n = scan.nextInt();
        System.out.println("Exponential");
        int r = scan.nextInt();

        //int counter = 1;
        int total = 1;

        //3^4 = 3 * 3 * 3 * 3;

        /*while(counter <= r){
            total=total * n;
            counter++;
        }*/
        for(int i =1;i <=r ;i++){
            total=total*n;
        }

        System.out.println(n+" to the power of "+r+" is = "+total);
    }
}
