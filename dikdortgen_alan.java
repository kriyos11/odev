import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int genislik;
        int yukseklik;
        int sonuc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Genişlik girin:");
        genislik = scanner.nextInt();

        System.out.println("Yükseklik girin:");
        yukseklik = scanner.nextInt();

        sonuc = genislik * yukseklik;

        if(genislik == yukseklik || yukseklik == genislik) {

            System.out.println("Girmiş olduğunuz sayılar karenin alanını hesaplar:" +sonuc);
        }
        else {
            System.out.println("Çevre:"sonuc);
        }
    }
}
