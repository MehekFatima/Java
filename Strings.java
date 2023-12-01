import java.util.*;
public class Strings
{
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";


     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i) == 'e') {
         result += 'i';
       } else {
         result += str.charAt(i);
       }
     }


     System.out.println(result);
	}
}
