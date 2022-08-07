package Solution;

import java.util.Scanner;

public class RemoveDuplicateArray {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вводим масив строк
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        //Проверка на Дубликаты
        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
