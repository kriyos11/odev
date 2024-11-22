import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long dyil = 0; //doğum yılı
        long yil = 2024; //şu anki yıl
        long sonuc = 0; // sonuç

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz yılı girin:");
        dyil = scanner.nextLong();

        sonuc = yil - dyil;

        System.out.println("Yaşınız"+ sonuc);


    }
}
