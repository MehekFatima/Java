import java.util.*;
public class StringsRev{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        for(int i = sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }
    }
}
