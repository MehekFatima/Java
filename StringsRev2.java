import java.util.*;
public class StringsRev2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        // using reverse function
        System.out.println("using a reverse function....");
        StringBuffer sbr =  new StringBuffer(sb.reverse());
        System.out.println(sbr);
        System.out.println("Without using reverse function...");
        for(int i =0;i<sb.length();i++){
            int front = i;
            int last= sb.length()-i-1;
            char frontch = sb.charAt(front);
            char lastch = sb.charAt(last);
            
            sb.setCharAt(front,lastch);
            sb.setCharAt(last,frontch);
        }
        System.out.println(sb);
        
    }
}
