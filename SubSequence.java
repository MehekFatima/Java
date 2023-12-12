import java.util.*;
public class SubSequence
{
    public static void printSubseq(String str, int indx, String newstr){
        if(indx == str.length()){
            System.out.print(newstr);
            return;
        }
        char currChar = str.charAt(indx);
        //include 
        printSubseq( str, indx+1,newstr+currChar);
        
        //not 
        printSubseq( str, indx+1,newstr);
    }
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSubseq( str, 0," ");
	}
}
