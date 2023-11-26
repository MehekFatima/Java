import java.util.*;
public class NEvenNumbers
{
	public static void main(String[] args) {
		System.out.println("Enter the range:");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("even numbers are..");
		for(int i =2;i<=n;i++){
	
		
		    if(i%2==0){
		        
		        System.out.println(i);
		        i++;
		    }
		}
		
	}
}
