import java.util.*;
public class FunEvenOdd
{
    public static void CheckEven(int n){
        
        if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd");
        }
        return;
        

    }
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		CheckEven(n);
	}
}
