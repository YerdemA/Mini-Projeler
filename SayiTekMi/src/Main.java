import java.util.Scanner;
// Girilen sayının tek mi çift mi olduğunu yazar.
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.!");
        int sayi = girdi.nextInt();

        if (sayi % 2 == 0) // 2'ye bölünme durumundan kalan sıfır ise
            System.out.println("Sayı çifttir.");

        else // değil ise
            System.out.println("Sayı tektir.");

    }

}