
/**
 * Write a description of class Nums here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Nums
{1
        public static void main(String[] args) {
        try (//напишите тут ваш код
        Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if ( a == c && b == c)
                System.out.printf("%s %s %s", a, a, a);
            else if (a == b || a == c)
                System.out.printf("%s %s", a, a);
            else if (b == c)
                System.out.printf("%s %s", b, b);
        }

    }

}
