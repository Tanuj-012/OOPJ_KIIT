package LAB4;
import java.util.Scanner;
interface Emploee
{
    public void getDetails();
}
interface Manager extends Emploee
{
    public void getdeptDetails();
}
class head implements Manager
{
    int empid;
    String ename;
    int deptid;
    String deptname;
    public void getDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER EMPLOYEE ID:");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER EMPLOYEE NAME:");
        ename = sc.nextLine();
    }
    public void getdeptDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER DEPARTMENT ID:");
        deptid = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER DEPARTMENT NAME:");
        deptname = sc.nextLine();

    }
    public  void display()
    {
        System.out.println("EMPLOYEE ID:"+empid);
        System.out.print("EMPLOYEE NAME:"+ename);
        System.out.print("DEPARTMENT ID:"+deptid);
        System.out.print("DEPARTMENT NAME:"+deptname);
    }
}
public class QUES4
{
    public static void main(String[] args)
    {
        head s1=new head();
        s1.getDetails();
        s1.getdeptDetails();
        s1.display();
    }

}
