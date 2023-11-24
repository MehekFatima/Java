import java.util.*;

public class UserInput{
    public static void main(String[] args) {
        System.out.println("Enter the username: ");
        Scanner sc = new Scanner(System.in);
        String Username = sc.nextLine();
        System.out.println("The username is: "+Username);
        
        System.out.println("Enter your Age: ");
        int age;
        age = sc.nextInt();
        System.out.println("your age is: " +age);
        
        System.out.println("Enter your salary: ");
        double salary;
        salary = sc.nextDouble();
        System.out.println("The salary is:" +salary);
        
    }
}
