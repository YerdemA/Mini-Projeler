import java.util.Scanner;
// 2 sayının ebob'unu bulup ekrana yazdırır.
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int ebob = 1;

        System.out.println("1. Sayıyı giriniz!");
        int sayi1 = girdi.nextInt();

        System.out.println("2. Sayıyı giriniz!");
        int sayi2 = girdi.nextInt();

        for (int i = Math.min(sayi1, sayi2); i >= 1; i--) { // Küçük sayıdan başlayıp 1'e kadar döngü devam eder.
            if (sayi1 % i == 0 && sayi2 % i == 0) { //İki sayıyı da tam bölmesi teyit edilir.
                ebob = i;
                break; // İki sayıyı da bölen ilk sayıda döngü biter. Çünkü sayı küçülerek devam eder.
            }
        } System.out.println(ebob);
    }
}