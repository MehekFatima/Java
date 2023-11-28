import java.util.*;
public class CountPNZ
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter 1 to start and  0 to stop: ");
    int n = sc.nextInt ();
    int pos = 0;
    int neg = 0;
    int zero = 0;
    while (n == 1)
      {
	System.out.println ("Enter a number: ");
	n = sc.nextInt ();
	if (n >= 1)
	  pos++;
	else if (n < 0)
	  neg++;
	else
	  zero++;

    System.out.println ("Enter a number 1 to continue and 0 to stop: ");
    n = sc.nextInt ();
}

    System.out.println ("Count of positive: " + pos);
    System.out.println ("Count of negative: " + neg);
    System.out.println ("Count of zero: " + zero);



  }
}
