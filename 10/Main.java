package Assignment_10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer in range 0-10 :");
        int num  = sc.nextInt();

        Thread factThread = new Factorial(num);
        Thread sumThread = new Sum(num);

        try {
            factThread.start();
            Thread.sleep(500);
            sumThread.start();
            // Wait for threads to join
            factThread.join();
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nMain method ended.");
    }
}





