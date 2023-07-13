public class Main {
    public static void main(String[] args) {
       double[] myList= {2.1 , 3.3, 4.7 , 8.1};
       double total=0;
       double max = myList[0];
       for (double o : myList){
           System.out.println(o);
           total +=o;
           if (max< o){
               max=o;
           }
       }
        System.out.println("Toplam : "+total);
        System.out.println("En büyük sayı : "+max);
    }
}