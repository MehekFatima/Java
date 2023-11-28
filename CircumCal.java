import java.util.*;
public class CircumCal
{
    public static double CalCircumference(double r){
        return 2*3.147*r;
    }
	public static void main(String[] args) {
		System.out.println("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		
		System.out.println(CalCircumference(r));
	}
}
