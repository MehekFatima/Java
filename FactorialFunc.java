import java.util.*;
public class FactorialFunc
{
    public static int FactorialCal(int n){
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
        return 1;
    }
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		
		FactorialCal(n);
	}
}