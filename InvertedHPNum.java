import java.util.*;
public class InvertedHPNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n(rows):");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--){
		    for(int j=1;j<= i;j++){
		        System.out.print(j);
		    }
		    System.out.println();
		}
		
	}
}