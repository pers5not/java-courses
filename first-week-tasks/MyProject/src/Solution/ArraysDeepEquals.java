package Solution;

import java.util.Arrays;
//Сравнение двумерных масивов
public class ArraysDeepEquals {
    public static void main(String[] args) {
        int[][] array = {{1, 1}, {2, 2}, {3, 3}};
        int[][] array1 = {{1, 1}, {2, 2}, {3, 3}};
        System.out.println(array.equals(array1));
        System.out.println(Arrays.deepEquals(array, array1));
    }
}
