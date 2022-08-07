package Solution;

import java.util.Arrays;

public class ThereAnyone {
    public static int[] array = {9, 8, 7, 6,  4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] array1 = Arrays.copyOf(array, array.length);
        Arrays.sort(array1);
        int index = Arrays.binarySearch(array, element);
        boolean answer = array[Math.abs(index)] == element ? true : false;
        System.out.println(answer);

    }
}
