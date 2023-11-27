import java.util.*;
public class PascalT {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
    
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / j;
            }
    
            System.out.println();
        }
        sc.close();
        
    }
}
