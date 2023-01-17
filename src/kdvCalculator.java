import java.util.Scanner;

public class kdvCalculator {
    public static void main(String[] args) {

        int para;
        float kdvkucukbin,kdvbuyukbin,kdvsizfiyat;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen ödediğiniz miktarı giriniz :");
        para = inp.nextInt();

        kdvkucukbin = ((para * 18)/100F);
        kdvbuyukbin = ((para * 8)/100F);

        System.out.println(para < 1000? "KDVsiz fiyat = "+(para-kdvkucukbin):"KDVsiz fiyat ="+(para-kdvbuyukbin));

        System.out.println("Ödediğiniz miktara göre sizden alınan KDV :");
        System.out.println(para < 1000?"Alınan KDV %18 : "+kdvkucukbin : "Alınan KDV %8 : "+kdvbuyukbin);




    }
}