import java.util.*;
public class PrimeRange
{
	public static void main(String[] args) {
		System.out.println("Enter the range:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int i;
		int j;
		for(i=n1;i<=n2;i++){
		    for(j=2;j<=i;j++){
		        if(i%j==0){
		            break;
		        }
		        
		    }
		    if(i==j){
		        System.out.println(j+"");
		    
		    
		    }
		}
	}
}
