package exception;

import java.util.Scanner;

public class Main {
    int age;
    Scanner s = new Scanner(System.in);
    age = s.nextInt();
    try {
     if(age<18 | age>150)
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
