import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Büyük ünlü harf giriniz.");
        char yourchar = scanner.next().charAt(0);

        switch (yourchar) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Kalın sesli ünlüdür.");
                break;
            case 'E':
            case 'İ':
            case 'ü':
            case 'Ö':
                System.out.println("İnce sesli ünlüdür.");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz.");
        }
    }
}