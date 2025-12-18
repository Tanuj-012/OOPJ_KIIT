package LAB2;

import java.util.Scanner;

public class QUES1 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int num;
        if (args.length != 10) {
            System.out.println("enter exactly 10 values");
            return;
        }
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(args[i]);
            if (num % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("total number of even number given is:" +even);
        System.out.println("total number of odd number given is:" +odd);
    }
}
