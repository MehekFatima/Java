import java.util.*;
public class ArrayMaxMin
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++){
		    array[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    if(array[i]<min){
		        min = array[i];
		    }
		    if(array[i]>max){
		        max = array[i];
		    }
		        
		}
		System.out.println("minimum number:" +min);
		System.out.println("maximum number:" +max);
		    
		
	}
}
