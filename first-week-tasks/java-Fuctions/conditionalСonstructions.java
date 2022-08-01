public class conditionalСonstructions
{
    int f (int x, int y) {
        if (x < y) {
            System.out.println("x < y");
            return x + y;
        }
        else{
            System.out.println("x >= y");
            if (x < 8) {
                return y + 7;
            }
        }
        return x - 2;
    }

    
    int g () {
        int a = f (3, 4);//7
        int b = f (a, 5);//12
        return b;
    }
}
