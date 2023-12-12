import java.util.*;
public class RecKeypadCom
{
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkeypad(String str, int indx, String combination){
        if(indx == str.length()){
            System.out.println(combination);
            return;
        }
        
        
        char currChar = str.charAt(indx);
        String mapping = keypad[currChar-'0'];
        for(int i =0;i<mapping.length();i++){
            printkeypad( str,indx+1, combination+mapping.charAt(i));
        }
    }
	public static void main(String[] args) {
		System.out.println("Enter a keypad:");
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		printkeypad(str, 0, " ");
	}
}
