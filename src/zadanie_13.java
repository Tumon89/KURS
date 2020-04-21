import java.util.Scanner;
public class zadanie_13 {
    public static void main (String agrs[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Впишите Первый текст:");
        String text1 = in.nextLine();
        System.out.println("Впишите Второй текст:");
        String text2 = in.nextLine();
        if (text1.length() < text2.length())
            System.out.println(text2);
        else if (text1.length() > text2.length())
            System.out.println(text1);
        else System.out.println("Строчки по количеству символов равны");
    }
}
