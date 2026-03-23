import java.util.Scanner;
public class Exam01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;

        num1 = s.nextInt();
        num2 = s.nextInt();

        double resDiv;
        resDiv = (double) num1 / num2;

        System.out.println(num1 + "/" + num2 + "=" + resDiv);
    }
}
