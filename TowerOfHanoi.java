import java.util.*;
public class TowerOfHanoi{
    public static void Hanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from source "+ src +" to destination "+dest);
            return;
        }
        Hanoi(n-1, src,dest,helper );
        System.out.println("Transfer disk "+n+" from source "+ src +" to destination "+dest);
        Hanoi(n-1,helper,src,dest);

    }
  public static void main(String[]args){
    System.out.println("Enter the number of disks: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Hanoi(n,"Src","Helper","Dest");
    sc.close();
  }
  
}
