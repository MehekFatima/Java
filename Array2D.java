import java.util.*;
public class Array2D
{
	public static void main(String[] args) {
	    int n,m;
	    
	    Scanner sc = new Scanner(System.in);
	     n= sc.nextInt();
	     m= sc.nextInt();
	     int[][] numbers = new int[n][m];
	    for(int i=0;i<n;i++){
	        for(int j =0;j<m;j++){
	        numbers[i][j]=sc.nextInt();
	        
	    }
	    }
	    for(int i =0;i<n;i++){
	        for(int j =0;j<m;j++){
		System.out.print(numbers[i][j] +" ");
	    }
	    System.out.println();
	}
}
}