package LAB3;

import java.util.Scanner;

class plastic2d {
    double l, b;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---ENTER DIMENSION---");
        System.out.println("ENTER LENGTH:");
        l = sc.nextDouble();
        System.out.println("ENTER BREADTH:");
        b = sc.nextDouble();
    }

    public double calculate() {
        return l * b * 40;
    }
}

class plastic3d extends plastic2d {
    double h;
    public void read() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER HEIGHT:");
        h = sc.nextDouble();
    }
    public double calculate()
    {
        return l*b*h*60;
    }
}

public class QUES1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("ENTER YOUR CHOICE:\n1:2D SHEET\n2: 3D SHEET");
        choice= sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                plastic2d sheet= new plastic2d();
                sheet.read();
                double value=sheet.calculate();
                System.out.println("COST FOR 2D SHEET: Rs"+value);
                break;
            }
            case 2:
            {
                plastic3d sheet= new plastic3d();
                sheet.read();
                double value=sheet.calculate();
                System.out.println("COST FOR 3D SHEET: Rs"+value);
                break;
            }
            default:
            {
                    System.out.println("ENTER VALID CHOICE");

            }

        }


    }
}
