import java.util.*;
public class InvertedHP
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n(rows):");
		int n = sc.nextInt();
		for(int i=n;i<=n;i--){
		    for(int j=1;j<= i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
	}
}