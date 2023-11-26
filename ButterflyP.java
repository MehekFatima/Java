import java.util.*;
public class ButterflyP {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt(); 
        //upper
        for(int i = 1;i<=n;i++){
            //1st
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for(int i = n;i>=1;i--){
            //1st
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

