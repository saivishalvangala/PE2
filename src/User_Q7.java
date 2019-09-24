import java.util.Scanner;

public class User_Q7 {
    private String first_name;
    private String last_name;
    private int age;
    private int salary;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String validAge(int age)
    {
        if(age>0&&age<60)
            return "valid-employee-age";
        else
            return "Invalid-employee-age";
    }

    public String getFullName(String first_name,String last_name)
    {
        return first_name+" "+last_name;
    }

    public  static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        String first_name=scan.nextLine();
        String last_name=scan.nextLine();
        int age=scan.nextInt();
        while(age<0||age>100)
        {
            System.out.println("invalid age. RE-ENTER");
            age=scan.nextInt();
        }
        int salary=scan.nextInt();
        details(first_name,last_name,age,salary);

    }
    public static void details(String f_name,String l_name,int userage,int salary)
    {

        User_Q7 obj=new User_Q7();
        obj.setFirst_name(f_name);
        obj.setLast_name(l_name);
        obj.setSalary(salary);
        obj.setAge(userage);
        String validity=obj.validAge(obj.getAge());
        String fullname=obj.getFullName(obj.getFirst_name(),obj.getLast_name());
        System.out.println("employee-age:"+validity);
        System.out.println("employee full-name:"+fullname);

    }
}
