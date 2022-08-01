
/**
 * Write a description of class Point here.
 * 
 * @author pers5not
 * @version 01/08/2022
 */
public class Point
{
  private int x;
  private int y;
  public Point(int startx, int starty) {
      x = startx;
      y = starty;
  }
  
  public int getX() {return x;}
  public int getY() {return y;}
  public double distance(Point otherPt){
      int dx = x - otherPt.getX();
      int dy = y - otherPt.getY();
      return Math.sqrt(dx * dx + dy * dy);
  }
  
  public static void main(String[] args){
      Point p1 = new Point (6,12);
      Point p2 = new Point (11,8);
      System.out.println(p1.distance(p2));
  }
}
