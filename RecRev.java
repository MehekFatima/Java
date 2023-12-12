import java.util.*;
public class RecRev
{
    public static void PrintRev(String str,int i){
        
       if(i==0){
           System.out.print(str.charAt(i));
           return;
       }
       
           System.out.print(str.charAt(i));
           PrintRev(str,i-1);
       
    }
	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = str.length()-1;
		PrintRev(str,i);
	}
}
