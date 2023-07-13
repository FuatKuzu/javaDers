public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");

        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }
        System.out.println("While döngüsü bitti.");

        int j = 100;
        System.out.println("Do while döngüsü başlıyor");
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-while bitti.");
    }

}