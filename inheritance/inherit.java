class Parent 
{
     public static void one()
    {
        System.out.println("parent class m1");
    }
    public static void two()
    {
        System.out.println("parent class m2");
    }
}
class child extends Parent
{
    public void c1()
    {
        System.out.println("child method 1");
    }
    public void c2()
    {
        System.out.println("child method2");
    }
}

class Inherit
{
   public static void main(String[] args) {
    child c = new child();
    c.c1();
    c.c2();
    c.one();
    c.two();
   }
}