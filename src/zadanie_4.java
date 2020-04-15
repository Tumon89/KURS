import java.util.Scanner;
public class zadanie_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Бинарное число: ");
        String binNum = in.nextLine();
        int numb = Integer.parseInt(binNum, 2);
        System.out.println(numb);
    }
}

