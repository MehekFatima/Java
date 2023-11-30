// to check if a sorted array is in ascending or descending order
import java.util.*;
public class ArrayAscen
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++){
		    array[i]=sc.nextInt();
		}
		boolean isAscending = true;
		for(int i=0;i<n-1;i++){
		    if(array[i]>array[i+1]){
		        isAscending = false;
		        
		    }
		}
		    if(isAscending){
		        System.out.println("Array is sorted in ascending order");
		    }
		    else{
		        System.out.println("Array is sorted in descending order");
		    }
		 
		
		
	}
}
