import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        sayi = scanner.nextLong();

        if(sayi>0){
            System.out.println("Girmiş olduğunuz sayı pozitifdir.");
        }
        else if(sayi<0){
            System.out.println("Girmiş olduğunuz sayı negatifdir.");
        }
        else if(sayi==0){
            System.out.println("Girmiş olduğunuz sayı nötrdür.");
        }

    }
}
