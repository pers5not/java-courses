package Solution;

public class MyltiplicationTable {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i-1][j-1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i-1][j-1] + "\t");
            }
            System.out.println();

        }
    }
}
