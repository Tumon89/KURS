import java.util.Scanner;
public class zadanie_12_2 {
    public static void main (String agrs[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Впишите Ваш ТЕКСТ:");
        String text = in.nextLine();
        String[] text_probel = text.split(" ");
        for (int i = 0; i < text_probel.length; i++) {
            System.out.print(text_probel[i]);
        }
    }
}
