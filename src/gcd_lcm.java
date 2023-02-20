import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n1: ");
        int n1= input.nextInt();
        System.out.println("Enter n2 :");
        int n2= input.nextInt();
        int d=1;
        int gcd=1;
        int lcm;

        if(n1<0 || n2<0){
            System.out.println("Please enter positive integers");
        }else{
            if(n1<n2){
                while(d<=n1){
                    if(n1%d==0 && n2%d==0){
                        gcd=d;
                    }
                    d++;
                }
                System.out.println("Greatest common divisor is : "+gcd);
                lcm = (n1*n2) /gcd;
                System.out.println("Least common divisor is : "+lcm);
            }else{
                System.out.println("N1 should be bigger than N2!");
            }

        }

    }
}
