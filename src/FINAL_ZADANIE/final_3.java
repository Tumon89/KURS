package FINAL_ZADANIE;

import java.util.Scanner;

public class final_3 {
    public static void main(String[] Convector) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Текущий курс доллара = ");
        double kursDollar = in.nextDouble();
        System.out.println("Количество рублей = ");
        double rubCount = in.nextDouble();
        double rezult = rubCount/kursDollar ;
        System.out.printf("Итого сумма долларов = %.2f", rezult);
    }
}
