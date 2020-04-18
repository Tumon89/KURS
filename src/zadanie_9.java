import java.util.Scanner;
public class zadanie_9 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int mass = in.nextInt();
        int massive[] = new int [mass];
        System.out.println("Массив записан");
        for (int y = 0; y < mass; y++) {
            if (y < mass) {
                System.out.println("Введите число:");
                int numb = in.nextInt();
                massive[y] = numb;
            }
            System.out.println("Записан Массив №" + y);
        }
        for (int x = 0; x < mass; x++) {
            if (x < mass) massive[x] = massive[x] * 2;
            System.out.println("Массив №" + x + " после умножения на 2 = " + massive[x]);
        }
    }
}
