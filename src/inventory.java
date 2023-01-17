import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        float apple=3.67F,tomato=1.11F,eggplant=5F,banana=0.95F,pear=2.14F;
        float kgs_apple,kgs_pear,kgs_tomato,kgs_banana,kgs_eggplant;
        float total_price;

        System.out.println("How many kilograms of apple?");
        Scanner input = new Scanner(System.in);
        kgs_apple =input.nextFloat();

        System.out.println("How many kilograms of pear?");
        kgs_pear = input.nextFloat();

        System.out.println("How many kilograms of tomato?");
        kgs_tomato =input.nextFloat();

        System.out.println("How many kilograms of banana?");
        kgs_banana =input.nextFloat();

        System.out.println("How many kilograms of eggplant?");
        kgs_eggplant =input.nextFloat();

        total_price=(apple*kgs_apple)+(pear*kgs_pear)+(tomato*kgs_tomato)+(banana*kgs_banana)+(eggplant*eggplant);
        System.out.println("Your total will be = "+total_price);





    }
}