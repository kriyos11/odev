import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double yaricap;
        double sonuc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarıçap Giriniz: ");
        yaricap = scanner.nextDouble();

        sonuc = 2 * 3.14 * yaricap;

        System.out.println("Çevre: " + sonuc);

    }
}
