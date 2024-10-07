public class CarpimTablosu{
    //Çarpım tablosunu ekrana yansıtır.
    public static void main(String[] args){

        int c = 1;

        System.out.print("        *Çarpım Tablosu*           \n  ");


        for (int i = 0; i < 9; i++){
            System.out.printf("%3d",c);
            c++;
        }
        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 1; i < 10; i++){
            System.out.printf("%d|",i);
            for (int j = 1; j < 10; j++){
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }
    }
}