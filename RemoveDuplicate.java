 import java.util.*;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    public static void printNoDup(String str, int indx, String newStr) {
        if (indx == str.length()) {
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(indx);
        if (map[currChar - 'a']) {
            // Duplicate character, do nothing
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
        }

        printNoDup(str, indx + 1, newStr);
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printNoDup(str, 0, "");
    }
}