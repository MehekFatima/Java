import java.util.*;
public class FuncHCF
{
  public static void CalHCF (int n1, int n2)
  {
    int h = 1;
    for (int i = 1; i <= n1; i++)
      {
	if (n1 % i == 0 && n2 % i == 0)
	  {
	    h = i;
	  }
      }
    System.out.println ("HCF is: " + h);
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter num1: ");
    int n1 = sc.nextInt ();
    System.out.println ("Enter num2: ");
    int n2 = sc.nextInt ();

    CalHCF (n1, n2);

  }
}
