package exception;
import exception.NewException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int age=29;

    try {
     if(age<18)
    {
        throw new NewException();
    }
    else
    {
        System.out.print("welcome to the billionare club");
    }   
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
    }
}
