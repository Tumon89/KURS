import java.io.*;
import java.util.Scanner;

public class zadanie_18 {
    public static void main (String rw []) throws Exception {

        String s;
        String text = "src\\Test.txt";
        String newText;
        BufferedReader nw =  new BufferedReader( new InputStreamReader(System.in));
        BufferedReader bf = new BufferedReader(new FileReader(text));
        LineNumberReader line = new LineNumberReader(new FileReader(text));
        int lineLength = 0;

        try (bf) {
            while ((s = bf.readLine()) != null) {
                while (null != line.readLine()) {
                    lineLength++;
                }
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println("Не удалось найти файл - " + ex);
        }

        try (FileWriter fw = new FileWriter(text)) {
            System.out.println("Перезаписать строки: ");
            int i = 0;
            do {
                newText = nw.readLine();
                if (i == lineLength) break;
                newText = newText + "\r\n";
                fw.write(newText);
                i++;
            } while (i != lineLength);
        } catch (IOException err) {
            System.out.println("Ошибка запис - " + err);
        }

    }
}
