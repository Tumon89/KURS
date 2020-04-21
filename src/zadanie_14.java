import java.util.Scanner;
public class zadanie_14 {
    public static void main (String agrs[]) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите число:");
        String S = text.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double) X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
