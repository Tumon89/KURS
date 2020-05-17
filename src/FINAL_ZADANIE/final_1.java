package FINAL_ZADANIE;

import javax.swing.text.html.parser.Parser;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class final_1 {
    public static void main (String agrs[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String binNum = in.nextLine();
        String reg = "[01]";
        String reg2 = "[2-9]";
        Pattern ptrn = Pattern.compile(reg);
        Pattern ptrn2 = Pattern.compile(reg2);
        Matcher match = ptrn.matcher(binNum);
        Matcher match2 = ptrn2.matcher(binNum);
        if (match2.find()) {
            System.out.println("Error input numeral");
        } else if (match.find()) {
            int y = 0;
            for (int i = 0; i < binNum.length(); i++) {
                y <<= 1;
                if (binNum.charAt(i) == '1') y++;
            }
            int number = y;
            System.out.println(number);
        }
    }
}
