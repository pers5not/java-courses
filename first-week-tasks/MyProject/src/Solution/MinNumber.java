package Solution;

import java.util.Scanner;

public class MinNumber {
    public static int[] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива - ");
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите элементе %s - ", i);
            array[i] = sc.nextInt();
        }
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println(min);
    }

}
