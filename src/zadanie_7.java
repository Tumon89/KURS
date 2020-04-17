import java.util.Scanner;
public class zadanie_7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = 3;
        int y = 6;
        int z = 9;
        System.out.println("Введите число : ");
        int number = in.nextInt();
        if (number == x)
            System.out.println("Данное значение имеется в константах");
        else if (number == y)
            System.out.println("Данное значение имеется в константах");
        else if (number == z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}
