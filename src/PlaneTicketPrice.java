import java.util.Scanner;

public class PlaneTicketPrice {
    public static void main(String[] args) {
        int km,age;
        int destination_type;
        boolean isError=false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the travel distance: ");
        km = inp.nextInt();
        float dd,tp,ad,price_per_km=0.10F;
        tp = km*price_per_km;

        System.out.print("Please enter your age: ");
        age= inp.nextInt();
        //1 for one-direction trip //2 for round trip
        System.out.print("Please enter your destination type:");
        destination_type=inp.nextInt();

        if ((km>=0 || age>=0) && (destination_type==1 || destination_type==2)){
            if(age<12){
                ad=tp*0.5F;
                tp-=ad;
            }
            if(age>=12 && age<=24){
                ad=tp*0.1F;
                tp-=ad;
            }
            if(age>65){
                ad=tp*0.3F;
                tp-=ad;
            }
            if (destination_type==2){
                dd=tp*0.2F;
                tp-=(dd);
                System.out.println("Your total is= "+tp);
            }else{
                System.out.println("Your total is= "+(2*tp));
            }
        }else{
            System.out.println("Invalid Values");
        }




    }
}
