package assignment2;

/**
 * 1.	Write a program to a specified number of generate fibonacci series.
 Note: Read the required count from the keyboard
 */
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the number");
        num = sc.nextInt();
        int fib = fibonacci(num);
        System.out.println(fib);

    }

    public static int fibonacci(int num){
        if(num==0 || num==1){
            return num;
        }
        else{
           return fibonacci(num-1) +fibonacci(num-2);
        }
    }
}
