import java.util.Scanner;
// Çemberin çevresini hesaplayıp ekrana yazdırır.
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        final double pi = 3.14; // Pi sabitini tanımlar

        System.out.println("Çemberin yarıçapını giriniz!");
        double r = girdi.nextDouble();

        double cevre = 2*pi*r; // Çemberin çevresini hesaplar
        System.out.println(cevre);
    }
}