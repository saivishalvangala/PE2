import java.util.*;
public class ReverseString_Q1 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String s=scan.nextLine();
        String result=revString(s);
        System.out.println(result);
        int flag=checkPalindrome(s,result);

        if(flag==1)
        {
            System.out.println("palindrome");

        }
        else
        {
            System.out.println("not a palindrome");
        }

    }

    public static String revString(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public static int checkPalindrome(String s, String result){
        if(s.equalsIgnoreCase(result))
        {
            return 1;
        }
        else
            return 0;
    }
}
