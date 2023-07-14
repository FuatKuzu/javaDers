import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();
       sayiBulmaca(number);
    }
    public static  void sayiBulmaca(int number){
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};

        boolean isVar = false;
        for (int o : numbers) {
            if (number == o) {
                isVar = true;
                break;
            }
        }
        if (isVar) {
            getMessage(number + " dizide bulunmaktadır.");

        } else {

            getMessage(number + " dizide bulunmamaktadır.");
        }

    }
    public static void getMessage(String message){
        System.out.println(message);
    }
}