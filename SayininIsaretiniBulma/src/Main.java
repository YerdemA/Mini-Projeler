import java.util.Scanner;
// Girilen sayının durumunu kontrol eder.(- 0 +)
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz!");
        int a = girdi.nextInt();

        if (a < 0)
            System.out.println("Sayı negatiftir");
        else if (a > 0)
            System.out.println("Sayı pozitiftir");
        else
            System.out.println("Sayı nötrdür");
    }
}