import java.util.*;
public class Greetings{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a button from (1-3): ");
        int button = sc.nextInt();
        switch(button){
            case 1 :
            System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Hi");
            break;
            default: System.out.println("INVALID!! please Enter a number from 1 to 3");
        }
        sc.close();
    }
}