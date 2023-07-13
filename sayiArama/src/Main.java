import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sayılar = new int[]{1, 2, 5, 7, 9, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayı = scanner.nextInt();
        boolean isVar = false;
        for (int o : sayılar) {
            if (sayı == o) {
                isVar = true;
            }
        }
        if (isVar) {
            System.out.println(sayı + " dizide bulunmaktadır.");
        } else {
            System.out.println(sayı + " dizide bulunmamaktadır.");
        }
    }
}