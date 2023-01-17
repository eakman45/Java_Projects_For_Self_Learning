import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        //Defining the minimum price and the price of the km per gone
        int opening_price = 10 ,min_price = 20;
        float price_per_km = 2.20F,final_price,km_gone;
        //Taking in the total length of kilometers in our trip
        System.out.println("Please enter the length of the trip = ");
        Scanner input = new Scanner(System.in);
        km_gone = input.nextInt();
        final_price=(opening_price+(price_per_km*km_gone));
        //print out the total prices
        System.out.println(final_price>20? "Price of your trip will be = "+final_price:"Your total will be = "+min_price);
    }
}