import java.util.*;

public class MoveX {
    public static void moveXPrint(String str, int indx, int count, String newStr) {
        if (indx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(indx);
        if (currChar == 'x') {
            count++;
        } else {
            newStr += currChar;
        }

        moveXPrint(str, indx + 1, count, newStr);
    }

    public static void main(String[] args) {
        System.out.println("Enter a string which should include X:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int indx = 0;
        String newStr = "";
        int count = 0;
        moveXPrint(str, indx, count, newStr);
    }
}