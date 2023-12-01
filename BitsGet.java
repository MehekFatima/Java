public class BitsGet
{
	public static void main(String[] args) {
		int n = 5;
		int pos = 2;
		int bitMask = 1<<2;
		if ((bitMask& n )== 0){
		    System.out.println("bit at "+pos+" "+"is"+" "+"zero");
		}
		else{
		 System.out.println("bit at "+pos+" "+"is"+" "+"one");
		}
	}
}
