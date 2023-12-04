import java.util.*;
public class RecPower
{
  public static int CalPower (int x, int n)
  {
      if(n==0)
        return 1;
      if(x==0)
        return 0;
      int xnM1 = CalPower(x,n-1);
      int pow = x*xnM1;
      return pow;
    
    
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a number:");
    int x = sc.nextInt ();
    System.out.println ("Enter its power:");
    int n = sc.nextInt ();
   int result= CalPower (x, n);
   System.out.println(result);

  }
}