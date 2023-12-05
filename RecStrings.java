public class RecStrings {
    public static void rev(String s,int indx){
        if(indx==0){
            System.out.print(s.charAt(indx));
            return;
        }
        System.out.print(s.charAt(indx));
        rev( s, indx-1);

    }
    public static void main(String[]args){
        String s = "abcd";
        rev(s,s.length()-1);
    }
}
