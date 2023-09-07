
public class thread extends Thread
{
    public void run()
    {
        System.out.println("threading");
    }
    public static void main(String[] args) {
        thread t1 = new thread();
        thread t2 = new thread();
        t1.start();        
        t2.start();
        System.out.println("done");
    }
}