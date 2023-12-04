import java.util.*;
public class RecFact
{
    public static void CalFac(int n,int i , int fact){
        if(i ==0){
            System.out.println("The factorial of"+" "+n+" "+"is:" +fact);
            return;
            
        }
        fact=fact*i;
        CalFac(n,i-1,fact);
        
        
    }
	public static void main(String[] args) {
		System.out.println("Enter a number:");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int fact =1;
	    int i =n;
	    CalFac(n,i,fact);
	}
}
