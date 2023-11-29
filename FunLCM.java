import java.util.*;
public class FunLCM
{
  public static void CalLCM (int n1, int n2)
  {
    int h = 1,l;
    for (int i = 1; i <= n1; i++)
      {
	if (n1 % i == 0 && n2 % i == 0)
	  {
	    h = i;
	  }
      }
      l = (n1*n2)/h;
    System.out.println ("LCM is: " + l);
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter num1: ");
    int n1 = sc.nextInt ();
    System.out.println ("Enter num2: ");
    int n2 = sc.nextInt ();

    CalLCM(n1, n2);

  }
}
