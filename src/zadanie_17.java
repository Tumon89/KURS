import java.io.*;
import java.util.Scanner;

public class zadanie_17 {
    public static void main(String agrs[]) throws Exception {

        Scanner into = new Scanner(System.in);
        System.out.println("Введите название файла:");
        String name = into.nextLine();
        String text;
        String newFile = "src\\" + name + ".txt";
        BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));
        System.out.println("По окончанию ввода и записи текста наберите слово 'стоп'");
        System.out.println("Вводите текст");

        try (FileWriter fw = new FileWriter(newFile)) {
            do {
                System.out.println("");
                text = br.readLine();
                if (text.compareTo("стоп") == 0) break;
                text = text + "\r\n";
                fw.write(text);
            } while (text.compareTo("стоп") != 0);
        } catch (IOException err) {
            System.out.println("Ошибка ввода: " + err);
        }
    }
}
