import java.util.*;
public class RecursionSumN
{
    public static void SumN(int n,int i,int sum){
        
        if( i==n){
            sum+=i;
            System.out.println(sum);
            return;
    }
    
        sum+=i;
    
    
    SumN(n,i+1,sum);
    }
	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		int sum =0;
		SumN(n,i,sum);
	}
}
