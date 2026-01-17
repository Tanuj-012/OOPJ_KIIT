package LAB2;
import java.util.Scanner;
class Student
{
    int roll;
    String name;
    double cgpa;
    public void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }
    public void display()
    {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class QUES5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].read();
        }
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++)
        {
            students[i].display();
        }
        double minCgpa = students[0].cgpa;
        String minName = students[0].name;
        for (int i = 1; i < n; i++)
        {
            if (students[i].cgpa < minCgpa)
            {
                minCgpa = students[i].cgpa;
                minName = students[i].name;
            }
        }
        System.out.println("\nStudent with lowest CGPA: " + minName + " (CGPA: " + minCgpa + ")");
    }
}