import java.util.*;
public class BitClear
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Enter the position:");
		int pos = sc.nextInt();
		int bitMask = 1<<pos;
		int t = ~(bitMask);
		int clr = t & n;
		System.out.println("The bits after performing clear at a given pos is: "+clr);
	}
}
