package FINAL_ZADANIE;

import java.util.Arrays;
import java.util.Scanner;

public class final_2 {
    public static void main (String agrs[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int mass = in.nextInt();
        int massive[] = new int[mass];
        System.out.println("Массив создан");
        for (int y = 0; y < mass; y++) {
            if (y < mass) {
                System.out.println("Введите число:");
                int numb = in.nextInt();
                massive[y] = numb;
            }
            System.out.println("Записан Массив №" + y);
        }
        System.out.println("Массив записан");
        System.out.println(Arrays.toString(massive));
        insertSort(massive);
    }


    public static void insertSort (int[] SortMass){
        System.out.println("Start Sort:");
        int min;
        for (int i = 0; i < SortMass.length - 1; i++) {
            min = i;
            for (int j = i; j < SortMass.length; j++) {
                if (SortMass[min] > SortMass[j]) {
                    min = j;
                }
            }
            int z = SortMass[i];
            SortMass[i] = SortMass[min];
            SortMass[min] = z;

        }
        System.out.println(Arrays.toString(SortMass));
        System.out.println("End Sort!");
    }
}
