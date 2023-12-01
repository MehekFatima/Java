import java.util.*;
public class SortBubble {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array:");
        int n = sc.nextInt();
        int[] num = new int[n];
        int t;
        for(int i=0;i<n;i++){
	        num[i]=sc.nextInt();
	        
	    }
        System.out.println("Array before sort.....");
        for(int i =0;i<=n-1;i++){
            System.out.print(num[i]+" ");
        } 
        //sort
         for(int i =0;i<=n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(num[j]>num[j+1]){
                    t = num[j];
                    num[j] =num[j+1];
                    num[j+1] =t;
                }
            }
         }
         
          System.out.println("\nArray after sort.....");
          for(int i =0;i<=n-1;i++){
            System.out.print(num[i]+" ");
        } 
        sc.close();
    }
}
