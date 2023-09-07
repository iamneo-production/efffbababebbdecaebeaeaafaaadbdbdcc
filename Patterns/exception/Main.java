package exception;

public class Main {
    int age = 78;
    if(age<18 | age>150)
    {
        throw new NewException();
    }
    else
    {
        System.out.print("welcome to the billionare club");
    }


}
