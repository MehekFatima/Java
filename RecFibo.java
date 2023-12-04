import java.util.*;
public class RecFibo
{
    public static void CalFibo(int n,int i,int a,int b,int c){
        if(i ==n+1){
            return;
        }
            
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
            CalFibo(n,i+1,a,b,c);
        
        
    }
	public static void main(String[] args) {
		System.out.println("Enter a number:");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i =1;
	    int a =0;
	    int b=1;
	    int c = a+b;
	    CalFibo(n,i,a,b,c);
	}
}
