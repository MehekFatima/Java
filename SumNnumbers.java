import java.util.*;
public class SumNnumbers {
    public static void main(String[]args){
        System.out.println("Sum of N natural numbers...");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for n:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("the sum is: "+sum);
sc.close();
    }
}
