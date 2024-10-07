import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();

        boolean asalMi = true;

        for (int i = 2; i <= sayi / 2; i++){
            if (sayi % i == 0)
                asalMi = false;
        }

        if (asalMi)
            System.out.println(sayi + " Sayısı asaldır.");
        else
            System.out.println(sayi + " Sayısı asal değildir.");

    }
}