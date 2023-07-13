public class Main {
    public static void main(String[] args) {
        String msg = "Bugün hava çok güzel.";
        /*
        System.out.println(msg);
        System.out.println("Eleman sayısı: "+msg.length());
        System.out.println("7. eleman : "+msg.charAt(6));
        System.out.println(msg.concat(" Harika."));
        System.out.println(msg.startsWith("B"));
        System.out.println(msg.endsWith("."));
        char[] karakterler = new char[5];
        msg.getChars(2,7,karakterler,0);
        System.out.println(karakterler);
        System.out.println(msg.indexOf("av"));
        System.out.println(msg.lastIndexOf("ze"));*/
        String yeniMsg = msg.replace(" ", "-");
        System.out.println(yeniMsg);
        System.out.println(msg.substring(5,8));
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        for (String kelime: msg.split(" ")){
            System.out.println(kelime);
        };
    }
}