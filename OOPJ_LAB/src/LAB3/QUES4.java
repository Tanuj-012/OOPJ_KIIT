package LAB3;

import java.util.Scanner;

class account {
    long acc_no;
    double balance;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ACCOUNT NUMBER:");
        acc_no = sc.nextLong();
        System.out.print("ENTER BALANCE:");
        balance = sc.nextDouble();
    }

    public void disp() {
        System.out.println(" ACCOUNT NUMBER:" + acc_no);
        System.out.println(" BALANCE:" + balance);
    }
}

class person extends account {
    String name;
    long aadhar_no;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NAME:");
        name = sc.nextLine();
        System.out.print("ENTER AADHAR NUMBER:");
        aadhar_no = sc.nextLong();
    }

    public void disp() {
        super.disp();
        System.out.println(" NAME:" + name);
        System.out.println("AADHAR NUMBER:" + aadhar_no);
    }

}

public class QUES4 {
    public static void main(String[] args)
    {
        person [] p1=new person[3];
        for (int i=0; i<3;i++)
        {
            p1[i]=new person();
            System.out.println("Enter details for person: "+(i+1));
            p1[i].input();
        }
        for (int i=0; i<3;i++)
        {
            p1[i].disp();
        }

    }

}
