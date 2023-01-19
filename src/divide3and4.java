import java.util.Scanner;

public class divide3and4 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        int count = 0;
        int avg = 0;


        Scanner inp = new Scanner(System.in);
        num= inp.nextInt();

        for(int i =1 ; i<=num;i++){

            if(i % 3==0 && i% 4 ==0){
                sum+=i;
                count++;
            }

        }
        avg=sum/count;
        System.out.println(avg);
    }
}
