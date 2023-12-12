import java.util.*;
public class FirstAndLastOc
{
    public static int first = -1;
    public static int last = -1;
    public static void PrintOc(String str, int i,char element){
        
        if(i==str.length()){
            System.out.println("first: " +first);
            System.out.println("last :" +last);
            return;
        }
        
        char CurrChar = str.charAt(i);
        if(CurrChar == element){
            if(first == -1){
                first =i;
            }
            else{
                last =i;
            }
        }
        PrintOc(str,i+1,element);
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("string:");
		String str = sc.nextLine();

		int i =0;
		
		PrintOc(str,i,str.charAt(i));
	}
}
