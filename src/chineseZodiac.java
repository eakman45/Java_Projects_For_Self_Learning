import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        int birth_year,chinese_zodiac,horoscope;
        System.out.print("Please enter your birth year: ");
        Scanner inp = new Scanner(System.in);
        birth_year= inp.nextInt();
        chinese_zodiac= (birth_year % 12);
        horoscope=chinese_zodiac;

        switch (horoscope){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 4:
                System.out.println("Pig");
                break;
            case 5:
                System.out.println("Mouse");
                break;
            case 6:
                System.out.println("Ox");
                break;
            case 7:
                System.out.println("Tiger");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
        }
    }
}
