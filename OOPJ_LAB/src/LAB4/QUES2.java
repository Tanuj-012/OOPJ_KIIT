package LAB4;

interface motor
{
    int capacity = 10;
     void run();
     void consume();

}

class washing_machine implements motor
{
    public void run()
    {
        System.out.println("WASHING MACHINE IS RUNNING. ");
    }

    public void consume() {
        System.out.println("IT IS CONSUMING ELECTRICITY");
    }

}

public class QUES2 {
    public static void main(String[] args) {
        washing_machine w1 = new washing_machine();
        w1.run();
        w1.consume();
    }
}
