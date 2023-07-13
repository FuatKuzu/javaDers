public class Main {
    public static void main(String[] args) {


        int num1=20;
        int num2= 10;
        int num3 = 30;

        int enBuyuk=num1;

        if (enBuyuk<num2){
            enBuyuk =num2;
        }
        if (enBuyuk<num3){
            enBuyuk = num3;
        }
        System.out.println("En büyük sayı "+enBuyuk);
   /*     String msg =" sayısı en büyüktür";
        if ((num1>num2)&&(num1>num3)){
            System.out.println(num1+msg);

        } else if ((num2>num1)&&(num2>num3)) {
            System.out.println(num2+msg);
        }else {
            System.out.println(num3+msg);
        }
        */


    }
}