import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("İki sayı giriniz. Birinci sayı: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();

        int totalNum1 = 0;
        int totalNum2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                totalNum1 += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                totalNum2 += i;
            }
        }if ((num1==totalNum2)&&(num2==totalNum1)){
            System.out.println(num1+" ve "+num2+" sayısı arkadaş sayıdır.");
        }else {
            System.out.println(num1+" ve "+num2+" sayısı arkadaş sayı değildir.");
        }
    }
}