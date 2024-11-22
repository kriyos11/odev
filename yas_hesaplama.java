import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dyil = 0; 
        int yil = 2021; 
        int sonuc = 0; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz yılı girin:");
        dyil = scanner.nextInt();

        sonuc = yil - dyil;

        System.out.println("Yaşınız:"+ sonuc);


    }
}
