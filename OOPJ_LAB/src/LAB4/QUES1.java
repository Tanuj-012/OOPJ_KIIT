package LAB4;
import java.util.Scanner;
abstract class student {
    int roll_no;
    int reg_no;
    abstract void course();
    public void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROLL NUMBER:");
        roll_no = sc.nextInt();
        System.out.print("ENTER REGISTRATION NUMBER:");
        reg_no = sc.nextInt();

    }
}

class kiitian extends student {
    void course() {
        System.out.println("B.Tech.(Computer Science & Engg.)");

    }
    void display()
    {
        System.out.println(" ROLL NUMBER:"+roll_no);
        System.out.println(" REGISTRATION NUMBER:"+reg_no);
    }

}

public class QUES1 {
    public static void main(String[] args)
    {
        kiitian s1= new kiitian();
        s1.getinput();
        s1.display();
        s1.course();

    }

}
