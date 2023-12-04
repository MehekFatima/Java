import java.util.*;
public class RecPrimeN
{
    public static void CalPrime(int n,int i,int count){
        if(i ==n){
            if(n%i==0){
                count+=1;
            }
            if(count==2){
            System.out.println("The number"+" "+n+" "+"is prime");
            }
            return;
            
        }
        if(n%i==0){
            count+=1;
        }
        CalPrime(n,i+1,count);
        
        
    }
	public static void main(String[] args) {
		System.out.println("Enter a number:");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i =1;
	    int count =0;
	    CalPrime(n,i,count);
	}
}
