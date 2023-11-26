import java.util.*;
public class HRhom {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt(); 
        //int j;
        for(int i = 1; i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }  
                else{
		            System.out.print(" ");
		        }
            }    
            System.out.println();
        }
}
}


