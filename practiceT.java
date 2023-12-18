import java.util.*;

class HelloWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Thala  for a reason.....");
        System.out.println("\n To check for a string press 1 \n for a number press 2:");
        int number_press = sc.nextInt();
        
        sc.nextLine(); // newline character
        
        switch(number_press){
            case 1:
                System.out.println("Enter a word to check thala for a reason:");
                String str = sc.nextLine();
                str = str.replaceAll("\\s+", "");
                if(str.length() == 7){
                    System.out.println(str + " Thala for a reason ");
                } else {
                    System.out.println(str + " not Thala for a reason ");
                }
                break;
            case 2:
                System.out.println("Enter number of numbers you want to check:");
                int sum =0;
                int n = sc.nextInt();
                int[] num = new int[n];
                System.out.println("Enter numbers to check thala for a reason:");
                for(int i =0;i<num.length;i++){
                    num[i] = sc.nextInt();
                }
                //check sum
                for(int i =0;i<num.length;i++){
                    sum += num[i];
                }
                if(sum == 7){
                    System.out.println(sum + " Thala for a reason ");
                } else {
                    System.out.println(sum + " not Thala for a reason ");
                }
                break;
                default: System.out.println("Enter number 1 or 2");
        }
    }
}
