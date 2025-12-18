package LAB2;

import java.util.Scanner;

public class QUES2 {

    static int count = 0;

    QUES2() {
        count++;
    }

    public static void main(String[] args) {
        QUES2 Q1 = new QUES2();
        QUES2 Q2 = new QUES2();
        QUES2 Q3 = new QUES2();
        System.out.println("TOTAL NUMBER OF OBJECT:" + count);
    }
}
