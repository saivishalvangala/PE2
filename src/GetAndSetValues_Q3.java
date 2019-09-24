import java.util.*;
public class GetAndSetValues_Q3 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int age=scan.nextInt();
        int salary=scan.nextInt();
        details(name,age,salary);

    }
    public static void details(String name,int age,int salary)
    {
        Member_Q3 obj=new Member_Q3();

        obj.setName(name);
        obj.setAge(age);
        obj.setSalary(salary);
        System.out.println(obj.toString());
    }
}
