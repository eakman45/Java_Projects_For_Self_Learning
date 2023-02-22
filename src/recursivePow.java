import java.util.Scanner;

public class recursivePow {
    static int power(int base,int pow){
        if(pow ==0){
            return 1;
        }else if (pow ==1){
            return base;
        }
        return base*power(base,pow-1);
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter the base number = ");
        int base = myInput.nextInt();
        System.out.println("Please enter the exponential = ");
        int exponential = myInput.nextInt();
        System.out.println(power(base,exponential));
    }
}
