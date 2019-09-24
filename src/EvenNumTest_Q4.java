import java.util.*;
public class EvenNumTest_Q4 {
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        boolean flag=isEven(num);
        if(flag==true)
        {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is  not an even");
        }

    }

    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
