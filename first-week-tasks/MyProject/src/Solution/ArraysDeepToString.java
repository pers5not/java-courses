package Solution;

import java.util.Arrays;
//Вывод двумерного массива
public class ArraysDeepToString {
    public static void main(String[] args) {
        int[][] array = {{1, 1}, {2, 2}, {3, 3}};
        String str = Arrays.deepToString(array);
        System.out.println(str);
    }
}
