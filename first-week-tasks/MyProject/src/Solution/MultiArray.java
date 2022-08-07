package Solution;

import java.util.Scanner;
import java.util.Arrays;

public class MultiArray {
    public static int[][] multiArray;


    public static void main(String[] args) {
        System.out.print("Введите длину Массива - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            multiArray[i] = new int[size];

        }
        System.out.println(Arrays.deepToString(multiArray));
    }
}
