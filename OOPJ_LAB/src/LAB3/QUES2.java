package LAB3;
import java.security.PublicKey;
import java.util.Scanner;
class  plate
{
    double l,w;
    public  void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER LENGTH:");
        l=sc.nextDouble();
        System.out.println("ENTER WIDTH:");
        w=sc.nextDouble();
    }
    public void display()
    {

        System.out.println("LENGTH :"+l);
        System.out.println(" WIDTH:"+w);
    }


}
class box extends plate
{
    double h;
    public void read()
    {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER HEIGHT:");
        h = sc.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("HEIGHT:"+h);
    }

}
class woodbox extends box
{
    double t;
    public void read()
    {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THICKNESS:");
        t = sc.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("THICKNESS:"+t);
    }
}
public class QUES2
{
    public static  void  main(String[] args)
    {
        woodbox w1= new woodbox();
        w1.read();
        w1.display();
    }

}

