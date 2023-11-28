import java.util.*;
public class FunTable
{
    public static void PrintTable(int n,int range){
        for(int i = 1;i<=range; i++ ){
            int mul = n * i;
            System.out.println(n + "*" + i + "=" + mul);
        }
        return;
        
    }
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the range: ");
		int range = sc.nextInt();
		
		
		PrintTable(n,range);
	}
}
