import java.util.Scanner;


public class passFail {
    public static void main(String[] args) {
        int tg, mg, fg, cg, musg, pass = 55;
        System.out.println("Please enter your grade: ");
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter your Turkish grade: ");
        tg = inp.nextInt();
        System.out.println("Please enter your Maths grade: ");
        mg = inp.nextInt();
        System.out.println("Please enter your Physics grade: ");
        fg = inp.nextInt();
        System.out.println("Please enter your Chemistry grade: ");
        cg = inp.nextInt();
        System.out.println("Please enter your Music grade: ");
        musg = inp.nextInt();
        if ((tg >= 0 && tg <= 100) && (tg >= 0 && tg <= 100) && (fg >= 0 && fg <= 100) && (cg >= 0 && cg <= 100) && (musg >= 0 && musg <= 100)) {
            double average;
            average = (tg + mg + fg + cg + musg) / 5F;
            System.out.println("Your average is = " + average);
            if (average >= pass) {
                System.out.println("You passed Congrats!");
            } else {
                System.out.println("You have failed");
            }
        } else {
            System.out.println("Please be more carefull ");
            System.out.println("Grades should be in range 0 to 100");
        }

    }
}
