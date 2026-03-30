import java.util.Scanner;

public class Exam02_02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        String res = (a + b).toLowerCase().replaceAll(" ","");

        System.out.println(res);

        s.close();
    }
}
