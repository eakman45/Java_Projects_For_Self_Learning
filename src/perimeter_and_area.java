import java.util.Scanner;

public class perimeter_and_area {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the raidus = ");
        r=input.nextInt();

        double center_angle,formula,area,perimeter;
        area = pi * r * r;
        perimeter = 2 * pi *r;
        System.out.println("The area of our circle = "+area+" and the perimeter is = "+perimeter);

        System.out.println("The calculation of the piece circle area = ");

        center_angle = input.nextInt();
        formula = (pi *(r*r)*center_angle)/360;

        System.out.println("The area of the piece circle which we know the radius and the center angle = "+formula);

    }
}