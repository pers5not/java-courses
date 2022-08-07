package Solution;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = {1, 2, 3};
        System.out.println(array.equals(array1));
        System.out.println(Arrays.equals(array, array1));
    }
}
