import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        String combined = a + b;

        String lowerCaseResult = combined.toLowerCase();
        String finalResult = lowerCaseResult.replaceAll(" ", "");

        System.out.println(finalResult);

        s.close();



    }
}

