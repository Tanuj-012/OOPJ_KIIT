package LAB2;
import java.util.Scanner;
class rectanglee
{
    int length;
    int breadth;
    rectanglee()// default
    {
        length=0;
        breadth =0;
    }
    rectanglee(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int area(int length,int breadth)
    {
        return length*breadth;
    }
}
public class QUES7 {
    public static void main(String[] args) {
        int l,b;
        Scanner s1 = new Scanner(System.in);
        rectanglee r1 = new rectanglee();
        System.out.println("ENTER LENGTH:");
        l=s1.nextInt();
        System.out.println("ENTER BREADTH:");
        b=s1.nextInt();
        System.out.println("AREA IS:");
        System.out.println(r1.area(l,b));
    }


}
