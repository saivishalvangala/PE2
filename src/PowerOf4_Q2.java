import java.util.*;
public class PowerOf4_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int flag=powerOf4(num);

        if(flag==1)
        {
            System.out.println("number is power of 4");
        }
        else
        {
            System.out.println("number is not a power of 4");
        }
    }


    public static int powerOf4(int num)
    {
        while(num>=4)
        {
            num=num/4;
        }
        if(num==1)
        {
            return 1;
        }
        else
            return 0;
    }
}
