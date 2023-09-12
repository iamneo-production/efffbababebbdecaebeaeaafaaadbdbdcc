package patterns;

public class pattern {
    public static void main(String[] args) {
       for(int i=0;i<10;i++)
       {
        for (int j = 10; j >= i; j--) {
            System.out.print(" ");
        }

        // loop to print the number of stars in each row
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}
