import java.util.*;
public class GradeEvaluation_Q5 {
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int num_stud=scan.nextInt();
        int temp;
        int[] grades=new int[num_stud];
        for(int i=0;i<num_stud;i++)
        {
            temp=scan.nextInt();
            while(temp<0||temp>100)
            {
                System.out.println("entered mark is incorrect.RE-ENTER");
                temp=scan.nextInt();
            }
            grades[i]=temp;
        }
        String result=computation(grades,num_stud);
        System.out.println(result);


    }



    public static String computation(int[]grades,int num_stud)
    {
        float avg=average(grades,num_stud);
        int max=maximum(grades,num_stud);
        int min=minimum(grades,num_stud);

        return "The average is:"+avg+"; "+"the maximum is:"+max+"; "+"the minimum is:"+min;
    }

    public static float average(int[] grades,int num_stud)
    {
        int sum=0;
        for(int i=0;i<num_stud;i++)
        {
            sum+=grades[i];
        }
        float j =(float) sum / num_stud;
        return j;

    }

    public static int maximum(int[] grades,int num_stud)
    {
        int max=grades[0];
        for(int i=1;i<num_stud;i++)
        {
            if(max<grades[i])
                max=grades[i];
        }
        return max;

    }

    public static int minimum(int[]grades,int num_stud)
    {
        int min=grades[0];
        for(int i=1;i<num_stud;i++)
        {
            if(min>grades[i])
                min=grades[i];
        }
        return min;

    }

}
