import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                counter += i;
            }

        }if (counter == number) {

            System.out.println(number + " sayısı mükemmel sayıdır.");

        }else {
            System.out.println(number + " sayısı mükemmel sayı değildir.");

        }
    }

}