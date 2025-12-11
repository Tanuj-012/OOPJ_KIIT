package LAB1;
import java.util.Scanner;
public class QUES1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter Roll Number:");
        long roll=sc.nextLong();
        System.out.println("Enter section:");
        int section=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Branch:");
        String Branch=sc.nextLine();
        System.out.println("NAME: "+name);
        System.out.println("ROLL NUMBER: "+roll);
        System.out.println("SECTION:CSE"+section);
        System.out.println("BRANCH: "+Branch);


    }


}
