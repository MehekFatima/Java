public class Recursion1 {
    public static void PrintNum(int  num){
        if(num==0){
            return;
        }
        System.out.println(num);
        PrintNum(num-1);
    }
    public static void main(String[] args){
        int num =5;
        PrintNum(num);
    }
}
