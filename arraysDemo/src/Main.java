public class Main {
    public static void main(String[] args) {
        String[] students = new String[4];
        students[0] = "Ali";
        students[1] = "Veli";
        students[2] = "Zehra";
        students[3] = "Zeynep";

        for (int i =0; i< students.length; i++){
            System.out.println(students[i]);
        }
        for (String o : students){
            System.out.println(o);
        }
    }
}