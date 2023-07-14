public class Main {
    public static void main(String[] args) {

        String message= "Bugün çok sıcak.";
        String newMessage= sehirVer();
        System.out.println(newMessage);
        int sayi= sum(17,4);
        System.out.println(sayi);
        int toplam= sum(5,7,8,21,1,6,3);
        System.out.println(toplam);

    }
    public static void ekle(){
        System.out.println("Eklendi.");
    }
    public static void sil(){
        System.out.println("Silindi.");
    }  public static void update(){
        System.out.println("Güncellendi.");
    }
public static String sehirVer(){
        return "Ordu";
}
public static int sum(int... numbers){
        int total =0;
        for (int nums: numbers){
            total += nums;
        }return total;
}
}