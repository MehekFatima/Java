import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation to be performed(1 for +,2 for -, 3 for *,4 for /,5 for %): ");
        int operator = sc.nextInt();
        switch(operator){
            case 1: 
            int sum;
            sum = num1+num2;
            System.out.println("The sum is: " +sum);
            break;

            case 2: 
            int sub;
            sub = num1-num2;
            System.out.println("The sub is: " +sub);
            break;

            case 3: 
            int mul;
            mul = num1*num2;
            System.out.println("The mulm is: " +mul);
            break;

            case 4: 
            if(num2==0){
                System.out.println("Divion not possible");
            }
            else{
                double div;
                div = num1/num2;
                 System.out.println("The div is: " +div);

            }
            
            break;

            case 5: 
             if(num2==0){
                System.out.println("Divion not possible");
            }
            else{
                int mod;
                mod = num1%num2;
                System.out.println("The rem is: " +mod);

            }
            
            break;
            default: System.out.println("Enter a valid operator");

        }
sc.close();
    }
}
