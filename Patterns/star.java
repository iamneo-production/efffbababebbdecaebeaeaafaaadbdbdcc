import java.lang.Thread;
public class star extends Thread
{
    public void run()
    {
        System.out.println("threading");
    }
    public static void main(String[] args) {
        star t1 = new star();
        star t2 = new star();
        t1.start();        
        t2.start();
        System.out.println("done");
    }
}