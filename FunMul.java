import java.util.*;
public class FunMul
{
    public static int Multiply(int num1,int num2){
        int mul = num1 * num2;
        return mul;
    }
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		int mul = Multiply(num1,num2);
		System.out.println("the product of two numbers is: "+mul);
	}
}