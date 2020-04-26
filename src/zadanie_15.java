import java.util.Scanner;
public class zadanie_15 {
    public static void main(String agrs[]) {
        int[] mass = new int[6];
        Scanner in = new Scanner(System.in);
        for (int y = 0; y < mass.length; y++) {
            if (y < mass.length) {
                System.out.println("Введите число:");
                int numb = in.nextInt();
                mass[y] = numb;
            }
        }
        System.out.println("Start Sort:");
        for (int i = mass.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] < mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
            System.out.println(mass[i]);
        }
        System.out.println("End Sort!");
    }
}
