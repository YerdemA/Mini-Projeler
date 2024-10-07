import java.util.Scanner;
// Girilen sayının faktöriyelini hesaplayıp ekrana yazdırır.
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");

        int girilenSayi = girdi.nextInt();
        int sonuc = 1;

        for (int i = 2; i <= girilenSayi; i++) // 2'den girilen sayıya kadar
            sonuc *= i;                        //çarpım yapılarak devam edilir.

        System.out.println(sonuc);
    }
}