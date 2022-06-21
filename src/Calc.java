// Javada if else ile basit hesap makinesi yapınız.

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        double select;

        // İlk olarak kullanıcıdan girişleri alıyoruz ve formüllere göre çıkan sonucu ekrana yazdırıyoruz.

        System.out.println();
        System.out.print("Ilk Sayiyi Giriniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        n2 = input.nextInt();
        System.out.println("\n1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme");
        System.out.print("\nSeciminizi Yapiniz : ");
        select = input.nextDouble();

        if (select == 1) {
            System.out.print("\nToplama Isleminin Sonucu : " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("\nCikarma Isleminin Sonucu : " + (n1 - n2));
        } else if (select == 3) {
            System.out.print("\nCarpma Isleminin Sonucu : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.print("\nBolme Isleminin Sonucu : " + (n1 / n2));
            } else {
                System.out.println("\nBir Sayi Sifira Bolunmez. Lutfen Tekrar Deneyiniz !");
            }
        } else {
            System.out.print("\nLutfen 1 ila 4 Arasinda Bir Sayi Seciniz ! ");
        }
    }
}