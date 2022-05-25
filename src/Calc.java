import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s1, s2;
        double secim;

        System.out.print("Ilk Sayiyi Giriniz : ");
        s1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        s2 = input.nextInt();
        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme");
        System.out.print("Seciminizi Yapiniz : ");
        secim = input.nextDouble();


        if (secim == 1) {
            System.out.print("Toplama Isleminin Sonucu : " + (s1 + s2));
        } else if (secim == 2) {
            System.out.print("Cikarma Isleminin Sonucu : " + (s1 - s2));
        } else if (secim == 3) {
            System.out.print("Carpma Isleminin Sonucu : " + (s1 * s2));
        } else if (secim == 4) {
            if (s2 != 0) {
                System.out.print("Bolme Isleminin Sonucu : " + (s1 / s2));
            } else {
                System.out.println("Bir sayi sifira bolunmez.");
            }
        } else {
            System.out.print("Lutfen 1 ila 4 arasinda bir sayi seciniz ! ");
        }
    }
}
