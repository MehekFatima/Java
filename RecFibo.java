import java.util.*;
public class RecFibo
{
    public static void CalFibo(int n,int i,int a,int b){
      if(i ==n){
            return;
        }
            
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;
            CalFibo(n,i+1,a,b);
        
        
    }
	public static void main(String[] args) {
		System.out.println("Enter a number:");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i =0,a =0,b=1;
	    CalFibo(n,i,a,b);
	}
}
