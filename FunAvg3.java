import java.util.*;
public class FunAvg3
{ 
    public static int AverageThreeNos(int n1,int n2,int n3){
        return (n1+n2+n3)/3;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter n2: ");
		int n2 = sc.nextInt();
		System.out.println("Enter n3: ");
		int n3 = sc.nextInt();
		System.out.println("The average is :" +AverageThreeNos(n1,n2,n3));
	}
}
