import java.util.Scanner;
public class zadanie_11 {
    public static void main (String agrs[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Впишите текст:");
        String text = in.nextLine();
        String fullTEXT = new String ("Вы ввели: " + text);
        System.out.println(fullTEXT);
    }
}
