package LAB4;

import java.util.Scanner;

interface employee
{
    void earning(double basic);

    void deduction(double basic);

    void bonus(double basic);
}

 abstract class manager implements employee
 {
    double b;
    public void earning(double basic)
    {
        this.b = basic;
        double da =0.80 * b;
        double hra = 0.15   * b;
        System.out.println("EARNING:" + (b + da + hra));
    }
    public void deduction(double basic) {
        this.b=basic;
        double deduction=0.12 * b;
        System.out.println("DEDUCTION:" +deduction);
    }
    abstract public void bonus(double bonus);
}

class substaff extends manager
{
    public void bonus(double basic)
    {
        this.b=basic;
        System.out.println("DEDUCTION:" + (0.5* b));
    }
}

public class QUES3
{
    public static void main(String[] args)
    {
        double basic;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER BASIC SALARY:");
        basic = sc.nextDouble();
        substaff s1= new substaff();
        s1.earning(basic);
        s1.deduction(basic);
        s1.bonus(basic);
    }

}