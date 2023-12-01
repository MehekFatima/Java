import java.util.*;
public class SortIns {
    public static void main(String[]args){
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n];
        //insert values into array
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Array before sort........");
        for(int i=0;i<n;i++){
            System.out.print(num[i] +" ");
        }

        //sort
        for(int i = 1;i<n;i++){
            int t = num[i];
            int j=i-1;
                while(j>=0 && num[j]>t){
                    num[j+1] = num[j];
                    j--;
                }

                num[j+1] = t;
            }
        
         System.out.println("\nArray after sort........");
        for(int i=0;i<n;i++){
            System.out.print(num[i] +" ");
        }
        sc.close();
    }
}


