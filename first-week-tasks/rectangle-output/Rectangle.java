
/**
 * Write a description of class Rectangle here.
 * 
 * @author pers5not 
 * @version 05/08/2022
 */
public class Rectangle
{
   public static void Main (String[] args){
       int i = 1;
       while(i <= 10){
           int j = 1;
           while(j<=20){
               if (i == 1 || i == 10)
                   System.out.print("Б");
               else
                   if (j == 1 || j == 20)
                       System.out.print("Б");
                   
                    else
                        System.out.print(" ");
                j++;
           }
           System.out.println();
           i++;  
       }
   }
}
