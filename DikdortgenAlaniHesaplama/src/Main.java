import java.util.Scanner;
// Dikdörtgenin alanını hesaplayıp ekrana yazdırır.
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("1. kenarı giriniz!");
        double kenar1 = girdi.nextDouble();
        System.out.println("2. kenarı giriniz!");
        double kenar2 = girdi.nextDouble();

        double alan = kenar1 * kenar2; // Dikdörtgenin alanını hesaplar

        System.out.println(alan);
    }
}