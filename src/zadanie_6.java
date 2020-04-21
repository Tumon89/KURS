import java.util.Scanner;
public class zadanie_6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число х: ");
        int x = in.nextInt();
        System.out.println("Введите число y: ");
        int y = in.nextInt();
        System.out.println("Введите число z: ");
        int z = in.nextInt();
        double arif = (x+y+z)/3;
        System.out.println(arif);
        double del = arif/2;
        System.out.println(del);
        if (del > 3)
            System.out.println("Программа выполнена корректно");
    }
}
