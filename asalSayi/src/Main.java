import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPrime= false;
        int num = scan.nextInt();

        if (num==1){
            System.out.println(num + " sayısı asal değildir.");
            return;
        }
if (num<1){
    System.out.println("Geçersiz sayı girdiniz.");
}
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime=true;
            }

        }
        if (isPrime){
            System.out.println(num + " sayısı asal değildir.");
        }else
            System.out.println(num + " sayısı asaldır.");
    }

}