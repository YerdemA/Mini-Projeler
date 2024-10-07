import java.util.Scanner;
// Girilen metni tersten yazdırır.
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Bir metin giriniz!");
        String metin = girdi.nextLine();

        for (int i = metin.length() - 1; i >= 0; i--) // Metnin son karakterinden başlanır.
            System.out.print(metin.charAt(i));    // İlk karakterine kadar harfler tek tek yazdırılır.
    }
}