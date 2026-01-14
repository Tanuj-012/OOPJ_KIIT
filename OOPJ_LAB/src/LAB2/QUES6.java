package LAB2;
import java.util.Scanner;
class subtract
{
    int  subtract(int a , int b)
    {
        return a-b;
    }
     int  subtract(int a , int b,int c)
    {
        return a-b-c;
    }
     double  subtract(double a , double b)
    {
        return a-b;
    }
}
public class QUES6 {
    public static void main(String[] args)
    {
        subtract s1= new subtract();
        System.out.println(s1.subtract(10,20));
        System.out.println(s1.subtract(10.2,20.3));
        System.out.println(s1.subtract(10,20,30));
    }


}
