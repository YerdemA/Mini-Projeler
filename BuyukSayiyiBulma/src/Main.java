import java.util.Scanner;
// 3 Sayıdan büyüğünü bulup ekrana yazdırır.
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("1. Sayıyı giriniz!");
        int sayi1 = girdi.nextInt();
        System.out.println("2. Sayıyı giriniz!");
        int sayi2 = girdi.nextInt();
        System.out.println("3. Sayıyı giriniz!");
        int sayi3 = girdi.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 >= enBuyuk)
            enBuyuk = sayi2;
        if (sayi3 >= enBuyuk)
            enBuyuk = sayi3;

        System.out.println(enBuyuk);
    }
}