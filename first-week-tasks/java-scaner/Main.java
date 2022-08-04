
/**
 * Write a description of class Main here.
 * 
 * @author pers5not 
 * @version 04/08/2022
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье, \n" + "Люблю твой строгий, стройный вид, \n" + "Невы державное теченье, \n" + "Береговой её гранит");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        // Пользовательский ввод 
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число - ");
        int number = sc.nextInt();
        System.out.println("Спасибо Вы ввели число " + number);
        // Проверка пользовательского ввода
        Scanner scc = new Scanner(System.in);
        System.out.println("Введите число - ");
        
        if (scc.hasNextInt()){
            int num = scc.nextInt();
            System.out.println("Спасибо Вы ввели число " + num);
        } else {
            System.out.println("Извините это не число, перезапустите программу и попробуйте снова");
        }
        
        Scanner scan = new Scanner("На голой ветке'" + "Ворон сидит одиноко.'" + 
        "Осенний вечер." + 
        "'*'" + 
        "В небе такая луна,'" + 
        "Словно дерево спилено под корень:'" + 
        "Белеет свежий срез." + 
        "'*'" + 
        "Как разлилась река!'" + 
        "Цапля бредет на коротких ножках,'" + 
        "По колено в воде.");
        // scan.useDelimiter("'"); - разделитель
        scan.useDelimiter("'"); 
        while (scan.hasNext()) { 
            System.out.println(scan.next()); } 
            scan.close(); // Закрыть сканер по завершению работы ОБЯЗАТЕЛЬНО
        
        
    }
}
