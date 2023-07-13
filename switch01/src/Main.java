import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char not;
        Scanner scn = new Scanner(System.in);
        not = scn.next().charAt(0);
        switch (not) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalese kaldınız!");
                break;
            default:
                System.out.println("Geçersiz not girildi");
                break;
        }
    }
}