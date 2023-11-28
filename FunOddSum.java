import java.util.*;
public class FunOddSum
{
    public static void CalOddSum(int n){
        int sum =1;
        if(n<1){
            System.out.println("Enter a valid number greater than 1");
        }
        for(int i = 1; i<=n ;i++){
            if(i%2!=0){
                sum++;
            }
        }
            System.out.println("The sum of odd numbers for the range" +" "+ n +": "+sum);
        
            
    }
	public static void main(String[] args) {
		System.out.println("Enter the range:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		CalOddSum(n);
	}
}
