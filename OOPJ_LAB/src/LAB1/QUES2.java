package LAB1;
import java.util.Scanner;
public class QUES2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks:");
        int marks= sc.nextInt();

        if (marks>=90&&marks<=100)
        {
            System.out.println("YOUR GRADE IS :O");
        }
        else if (marks>=80&&marks<90)
        {
            System.out.println("YOUR GRADE IS :E");
        }
        else if (marks>=70&&marks<80)
        {
            System.out.println("YOUR GRADE IS :A");
        }
        else if (marks>=60&&marks<70)
        {
            System.out.println("YOUR GRADE IS :B");
        }
        else if (marks>=50&&marks<60)
        {
            System.out.println("YOUR GRADE IS :C");
        }
        else if (marks>0&&marks<50)
        {
            System.out.println("YOUR GRADE IS :F");
        }
        else
        {
            System.out.println("ENTER VALID MARKS");
        }


    }
}
