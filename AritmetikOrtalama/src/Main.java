import java.util.Scanner;
// Girilen 5 sayının ortalamasını ekrana yazdırır.
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("5 sayı giriniz!");
        int sayi1 = girdi.nextInt();
        int sayi2 = girdi.nextInt();
        int sayi3 = girdi.nextInt();
        int sayi4 = girdi.nextInt();
        int sayi5 = girdi.nextInt();

        System.out.println((sayi1+sayi2+sayi3+sayi4+sayi5) / 5);
    }
}