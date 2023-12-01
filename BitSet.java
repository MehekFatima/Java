import java.util.*;
public class BitSet
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Enter the position:");
		int pos = sc.nextInt();
		int bitMask = 1<<pos;
		int bitSet = bitMask|n;
		
		    System.out.println(bitSet);

	}
}
