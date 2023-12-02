import java.util.*;
public class BitUpd
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Enter the position:");
		int pos = sc.nextInt();
		System.out.println("Enter the updatation number 1 or 0:");
		int U = sc.nextInt();
		int bitMask = 1<<pos;
		
		if ( U== 1){
		    int NewNumber = bitMask|n;
		    System.out.println("The new number :" +NewNumber);
		}
		else{
		    int notBM = ~(bitMask);
		    int NewNumber = notBM&n;
		 System.out.println("The new number :" +NewNumber);
		}
	}
}
