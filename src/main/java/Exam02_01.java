import java.util.Scanner;

public class Exam02_01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        a = a + b;

        System.out.println(a.toLowerCase().replaceAll(" ", ""));

        s.close();
    }
}
