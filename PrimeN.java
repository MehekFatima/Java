import java.util.*;
public class PrimeN
{
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int i;
		if(n>1){
		    for( i=1;i<=n;i++){
		        if(n%i==0){
		            count++;
		        }
		        
		}
		if(count==2)
		{
		      System.out.println(n+"is prime number");
		 }
		 else{
		  System.out.println(n+" is not a prime number");
		  }
		    
		    
		}
		else{
		
		System.out.println("Not a prime number");
		}
	}
}
