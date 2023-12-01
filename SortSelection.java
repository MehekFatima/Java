import java.util.*;
public class SortSelection {
    public static void main(String[]args){
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n];
        //insert
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Array before sort........");
        for(int i=0;i<n;i++){
            System.out.print(num[i] +" ");
        }

        //sort
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]>num[j]){
                    int t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                }
            }
        }
         System.out.println("\nArray after sort........");
        for(int i=0;i<n;i++){
            System.out.print(num[i] +" ");
        }
    }
}
