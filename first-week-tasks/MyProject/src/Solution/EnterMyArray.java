package Solution;
import java.util.Scanner;
public class EnterMyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива - ");
        int n = sc.nextInt();
        int[] numArray;
        if (n > 0) {
            numArray = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Введите элементе %s - ", i);
                numArray[i] = sc.nextInt();
            }
            if (n % 2 == 0) {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(numArray[i] + ", ");
                }
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(numArray[i] + ", ");
                }
            }
        }
    }
}

