public class Main {
    public static void main(String[] args) {
        String[][] city = new String[3][3];

        city[0][0] = "İstanbul";
        city[0][1] = "Tekirdağ";
        city[0][2] = "İzmir";
        city[1][0] = "Ankara";
        city[1][1] = "Bolu";
        city[1][2] = "Konya";
        city[2][0] = "Ordu";
        city[2][1] = "Samsun";
        city[2][2] = "Trabzon";

        for (int i = 0; i< city.length; i++){
            for (int j=0; j< city[i].length; j++){
                System.out.print(city[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}