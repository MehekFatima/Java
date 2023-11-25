import java.util.*;
public class Tables {
    public static void main(String[]args){
        System.out.println("Table of a given number is...");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for num:");
        int num = sc.nextInt();
       
        for(int i = 1;i<=10;i++){
          int res = num * i;
        System.out.println(num +"*"+ i +"=" +res);
        }
        
sc.close();
}
}