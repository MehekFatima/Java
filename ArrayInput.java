import java.util.*;
public class ArrayInput
{
	public static void main(String[] args) {
	    int n;
	    
	    Scanner sc = new Scanner(System.in);
	     n= sc.nextInt();
	     int[] numbers = new int[n];
	    for(int i=0;i<n;i++){
	        numbers[i]=sc.nextInt();
	        
	    }
	    for(int i =0;i<n;i++){
		System.out.println(numbers[i]);
	    }
	}
}
