
/**
 * Write a description of class Jloop here.
 * 
 * @author pers5not
 * @version 01/08/2022
 */
class Main
{
    // Перебираем символы строки
    public static void main(String[] args)
    {
        String s = "Techie Delight";
 
        for (String ch: s.split("")) {
            System.out.print(ch + "\n");
        }
    }
}