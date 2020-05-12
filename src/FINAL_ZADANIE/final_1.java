package FINAL_ZADANIE;

import java.util.Scanner;

public class final_1 {
    public static void main (String agrs[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String binNum = in.nextLine();
        int y = 0;
        for (int i = 0; i < binNum.length(); i++) {
            y <<= 1;
            if (binNum.charAt(i) == '1') y++;
        }
        int number = y;
        System.out.println(number);
    }
}
