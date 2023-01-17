import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();
        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();
        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();
        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();
        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

        float toplamNot = (mat+fizik+kimya+turkce+tarih+muzik);
        float ortalama = (toplamNot/6);
        System.out.println("Ortalamanız = "+ortalama);
        System.out.println(ortalama>=60? "Ortalama= "+ortalama+" Sınıfı Geçti":"Ortalama= "+ortalama+" Sınıfta kaldı");





    }
}
