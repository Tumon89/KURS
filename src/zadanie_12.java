import java.util.Scanner;
public class zadanie_12 {
    public static void main (String agrs[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Впишите Ваш ТЕКСТ:");
        String text = in.nextLine();
        String new_next = new String(text.replace(" ", ""));
        System.out.println(new_next);
    }
}
