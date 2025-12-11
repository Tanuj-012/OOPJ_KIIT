package LAB1;
import java.util.Scanner;
public class QUES4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value which is to be checked For Palindrome:");
        int value = sc.nextInt();
        int temp1 = value;
        int remainder, reverse = 0;
        while (temp1 != 0)
        {
            remainder = temp1 % 10;
            reverse = reverse * 10 + remainder;
            temp1=temp1/10;
        }
        if (reverse==value)
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not palindrome");
        }
    }
}
