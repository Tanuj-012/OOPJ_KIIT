package LAB2;

import java.util.Scanner;

class rectangle
{
    int l, b, a, p;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LENGTH");
        int l = sc.nextInt();
        System.out.println("ENTER BREADTH");
        int b = sc.nextInt();
    }

    public void calculate() {
        a = l * b;
        p = 2 * (l + b);

    }

    public void display() {
        System.out.println("ENTERED LENGTH:" + l);
        System.out.println("ENTERED BREADTH:" + b);
        System.out.println("AREA OF RECTANGLE:" + a);
        System.out.println("PERIMETER OF RECTANGLE:" + p);


    }


}

public class QUES4 {

    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.read();
        r1.calculate();
        r1.display();


    }

}
