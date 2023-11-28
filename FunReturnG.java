import java.util.*;
public class FunReturnG
{
    public static int GreatestNum(int a, int b){
        if ( a== b){
         System.out.println("Invalid entry");
         return 0;
        }
        if(a>b)
        {
            return a;
        }
        
        else
         return b;
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b= sc.nextInt();
		
		
		System.out.println(GreatestNum(a,b));
		
	}
}
