package LAB3;

class  apple
{
    public  void show()
    {
        System.out.println("YOU ARE IN APPLE CLASS.");
    }
}
class banana extends apple
{
    public  void show()
    {
        System.out.println("YOU ARE IN BANANA CLASS.");
    }

}
class cherry extends apple
{
    public  void show()
    {
        System.out.println("YOU ARE IN CHERRY CLASS.");
    }

}
public class QUES3 {
    public  static  void main(String[] args)
    {
        apple w1;
        w1= new apple();
        w1.show();
        w1= new banana();
        w1.show();
        w1= new cherry();
        w1.show();
    }
}
