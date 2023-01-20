import java.util.Scanner;

public class combinationRofN {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("r combination of n is :");
        System.out.println("C(n,r)");
        System.out.print("Enter your n:");
        int n = inp.nextInt();
        System.out.print("Enter your r:");
        int r = inp.nextInt();
        int total=1;
        int total2=1;
        int total3=1;

        //n factorial
        for(int i=1;i <= n ;i++){
            total *= i;
        }
        //r factorial
        for(int j =1; j <= r;j++){
            total2 *= j;
        }
        //(n-r) factorial
        for (int z = 1;z <= (n-r);z++){
            total3 *= z;
        }
        //C(n,r)=n!/(r!-(n-r)!
        System.out.print(r+" Combination of "+n+" is :");
        System.out.println(total/(total2*total3));

    }
}
