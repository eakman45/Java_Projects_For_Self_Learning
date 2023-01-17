
import java.util.Scanner;

public class zodiacSigns {
    public static void main(String[] args) {
        int month,day;
        String zodiac = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your birth month: ");
        month = inp.nextInt();
        System.out.print("Please enter your birth day: ");
        day = inp.nextInt();

        if (month==1){
            if (day>=1 && day<=31) {
                if (day < 22) {
                    zodiac = "Capricorn";
                } else {
                    zodiac = "Aquarius";
                }
            }else {
                isError = true;
            }
        }
        else if(month==2){
            if (day>=1 && day<=28) {
                if (day < 20) {
                    zodiac = "Aquarius";
                } else {
                    zodiac = "Pisces";
                }
            }else {
                isError = true;
            }
        }
        else if(month==3){
            if (day>=1 && day<=31) {
                if (day < 21) {
                    zodiac = "Pisces";
                } else {
                    zodiac = "Aries";
                }
            }else {
                isError = true;
            }
        }
        else if (month==4){
            if (day>=1 && day<=30) {
                if (day < 21) {
                    zodiac = "Aries";
                } else {
                    zodiac = "Taurus";
                }
            }else {
                isError = true;
            }
        }
        else if (month==5){
            if (day>=1 && day<=31) {
                if (day < 22) {
                    zodiac = "Taurus";
                } else {
                    zodiac = "Gemini";
                }
            }else {
                isError = true;
            }
        }
        else if (month==6){
            if (day>=1 && day<=30) {
                if (day < 23) {
                    zodiac = "Gemini";
                } else {
                    zodiac = "Cancer";
                }
            }else {
                isError = true;
            }
        }
        else if (month==7){
            if (day>=1 && day<=31) {
                if (day < 23) {
                    zodiac = "Cancer";
                } else {
                    zodiac = "Leo";
                }
            }else {
                isError = true;
            }
        }
        else if (month==8){
            if (day>=1 && day<=30) {
                if (day < 23) {
                    zodiac = "Leo";
                } else {
                    zodiac = "Virgo";
                }
            }else {
                isError = true;
            }
        }
        else if (month==9){
            if (day>=1 && day<=31) {
                if (day < 23) {
                    zodiac = "Virgo";
                } else {
                    zodiac = "Libra";
                }
            }else {
                isError = true;
            }
        }
        else if (month==10){
            if (day>=1 && day<=28) {
                if (day < 23) {
                    zodiac = "Libra";
                } else {
                    zodiac = "Scorpio";
                }
            }else {
                isError = true;
            }
        }
        else if (month==11){
            if (day>=1 && day<=31) {
                if (day < 22) {
                    zodiac = "Scorpio";
                } else {
                    zodiac = "Sagittarius";
                }
            }else {
                isError = true;
            }
        }
        else if (month==12){
            if (day>=1 && day<=31) {
                if (day < 22) {
                    zodiac = "Sagittarius";
                } else {
                    zodiac = "Capricorn";
                }
            }else {
                isError = true;
            }
        }
        if (isError){
            System.out.println("Hatalı bir giriş yaptınız! Tekrar deneyin.");
        }else {
            System.out.println("Your Horoscope is : "+zodiac);
        }













    }

}
