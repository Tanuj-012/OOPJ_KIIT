package LAB1;
import java.util.Scanner;
public class QUES5 {
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstname=sc.nextLine();
        System.out.println("Enter Last Name:");
        String lastname=sc.nextLine();
        System.out.print("your name is :"+lastname+" "+firstname);
    }
}
