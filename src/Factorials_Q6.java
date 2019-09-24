import java.util.*;
public class Factorials_Q6 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int fact1=factorial1(num);
        if(fact1<0)
        {
            Long fact2=factorial2(num);
            System.out.println(fact2);
        }
        else
            System.out.println(fact1);

    }

    public static int factorial1(int num){
        if(num==1||num==0)
            return 1;
        int prod=1;
        int i=num;
        while(i>1)
        {
            prod*=i;
            i--;
            if(prod<0)
            {
                break;
            }
        }
        return prod;
    }
    public static long factorial2(int num){
        if(num==1||num==0)
            return 1;
        long prod=1;
        long i=num;
        while(i>1)
        {
            prod*=i;
            i--;
        }
        return prod;
    }

}
