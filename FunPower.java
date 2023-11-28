import java.util.*;
public class FunPower
{
  public static void CalPower (int x, int n)
  {
    int pow = 1;
    for (int i = 0; i <= n - 1; i++)
      {
	pow = pow * x;
      }
    System.out.println (x + " " + "to the power" + " " + n + "" + "is: " +
			pow);
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a number:");
    int x = sc.nextInt ();
    System.out.println ("Enter its power:");
    int n = sc.nextInt ();

    CalPower (x, n);

  }
}
