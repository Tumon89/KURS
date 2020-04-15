import java.util.Scanner;
public class zadanie_5_2 {
        public static void main(String agrs[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число для умножения:");
            String numb = in.nextLine();
            int i = Integer.parseInt(numb);
            int y;
            int x = 1;
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
            System.out.println(i + " * " + x + " = " + (y = i*x++));
        }
    }

