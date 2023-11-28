import java.util.*;
public class FunPrime
{
    public static int PrimeCal(int n){
      if(n<0){
          System.out.println("INVALID NUMBER");
          return 1;
      }
      int count =0;
        for(int i =1;i<=n;i++){
        if(n%i==0){
            count++;
        }
        }
        if(count==2){
        System.out.println(n+" "+ "Is prime number");
        }
        else{
            System.out.println("Not prime");
        }
        return 1;
    }
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		
		PrimeCal(n);
	}
}