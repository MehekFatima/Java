import java.util.*;
public class SubSeqUnique
{
    public static void PrintUniqueSubSeq(String str,int indx,String newstr, HashSet<String> set)
{
    if(indx == str.length()){
        if(set.contains(newstr)){
            return;
        }
        else{
            System.out.println(newstr);
            set.add(newstr);
            return;
        }
    }
    char currChar = str.charAt(indx);
    PrintUniqueSubSeq(str,indx+1,newstr+currChar,set);
    
    PrintUniqueSubSeq(str,indx+1,newstr,set);
    
}
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashSet <String> set = new HashSet<>();
		PrintUniqueSubSeq(str,0," ",set);
	}
}
