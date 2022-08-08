package Solution;

public class FindIndex {
    public static int resolve(int[] array, int arraySize) {
        int index = 1;
        int index1 = 0;
        for (int i = 0; i < arraySize; i++){
            System.out.println(i);
            if (array[i] == 0 && i == 0)
                index = 0;
            if (array[i] == 0)
                index1 = i;
        }

        if (array[index] == 0 && array[index1] == 0)
            return index1 -1;
        else if (array[index1] == 0 && array[index1 - 2] == 0)
            return index1 -1;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{ 0, 1, 0};
        System.out.println(resolve(a, 3));
    }
}
