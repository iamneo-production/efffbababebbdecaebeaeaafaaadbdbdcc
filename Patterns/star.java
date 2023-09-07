import java.lang.Thread;
public class star extends Thread
{
    public void run()
    {
        System.out.println("threading");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();        
    }
}