package Solution;

import java.util.Arrays;

public class FillingAnArray {
    public static int[] array = new int[7];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        double num = Math.ceil(array.length / 2.0);
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, (int) num, valueStart);
            Arrays.fill(array, (int) num, array.length, valueEnd);
            String str = Arrays.toString(array);
            System.out.println(str);
        } else {
            Arrays.fill(array, 0, (int) num, valueStart);
            Arrays.fill(array, (int) num, array.length, valueEnd);
            String str = Arrays.toString(array);
        }

    }
}
