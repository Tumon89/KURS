import java.io.*;

public class zadanie_16 {
    public static void main(String agrs[]) {
        String s;
        String text = "src\\Test.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(text))) {
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println("Не удалось найти файл " + ex);
        }
    }
}
