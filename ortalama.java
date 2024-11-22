import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sinav1;
        double sinav2;
        double sinav3;
        double ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sınav notunu giriniz: ");
        sinav1 = scanner.nextDouble();
        System.out.println("İkinci sınav notunu giriniz:");
        sinav2 = scanner.nextDouble();
        System.out.println("Üçüncü sınav notunu giriniz:");
        sinav3 = scanner.nextDouble();

        ortalama = (sinav1 + sinav2 + sinav3) / 3;

        if(ortalama > 50){
            System.out.println("Öğrenci geçti. Ortalaması: " + ortalama);
        }
        else{
            System.out.println("Öğrenci kaldı. Ortalaması: " + ortalama);
        }

    }
}
