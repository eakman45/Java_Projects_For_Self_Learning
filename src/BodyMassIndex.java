import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        //variable declaration
        float kg,meters,bmi;
        //taking the inputs from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kilograms");
        kg = input.nextFloat();
        System.out.println("Please enter your height in meters");
        meters = input.nextFloat();
        //Calculating and printing out the body mass index
        bmi = kg / (meters*meters);
        System.out.println("Your body mass index is = "+bmi);

    }
}