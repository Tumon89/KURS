import java.util.Scanner;
public class zadanie_10 {
    public static void main (String agrs[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый размер массива:");
        int mass1 = in.nextInt();
        System.out.println("Введите второй размер массива:");
        int mass2 = in.nextInt();
        int massive[][] = new int [mass1][mass2];
        System.out.println("Массив записан");
        for (int y = 0; y < mass1; y++) {
            for (int x = 0; x < mass2; x++) {
                if (y < mass1 || x <mass2) {
                System.out.println("Введите число:");
                int numb = in.nextInt();
                massive[y][x] = numb;
                }
            }
        }
        for (int t = 0; t <mass1; ++t) {
            for (int i = 0; i < mass2; ++i) {
                massive[t][i] = massive[t][i] * 3;
                System.out.print(massive[t][i] + " ");
            }
           System.out.println();
            break;
        }
    }
}
