import java.util.*;
public class PatternZ
{
	public static void main(String[] args) {
		System.out.println("Enter number of rows:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int i;
		for(i =1;i<=n;i++){
		    
		    for(int j =1; j<=n;j++){
		        if(i == 1 || i ==n){
		    
		      System.out.print("*");
		    }
		    else if(i+j==n+1)
		       System.out.print("*");
		    else
		      System.out.print(" ");
		    }
		    
		    
	//	}
		System.out.println();
	}
}
}
