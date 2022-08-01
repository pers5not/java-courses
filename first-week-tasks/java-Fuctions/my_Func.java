
/**
 * Write a description of class func here.
 * 
 * @author pers5not 
 * @version 01.08.2022
 */
public class my_Func
{
    //z = 3 * 2 - 7 = -1
    //z * x = 3 * -1 = -3
    //z = 2 * 9 - 10 = 8
    // return = 8 * 9 = 72
    int myFunction(int x, int y) {
        int z = 2 * x - y;
        return z * x;
    }
    
    //n = -3 * -3 = 9
    //return = 3 + (9, 10) = 75
        int f (int n ) {
        return 3 + myFunction(n, n+1); //3 + 72 75
    }
    
    //b = 75
    int g() {
        int a;
        a = myFunction(3, 7); //-3
        int b = f(a * a);
        return b;
    }
}
