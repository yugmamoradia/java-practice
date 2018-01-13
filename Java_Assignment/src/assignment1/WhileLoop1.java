package assignment1; /**
 * Created by ravi on 1/11/18.
 */

/**
 * Exercise 1:
 create a while loop to display sum of integers
 output e.g:
 Enter an integer
 3
 sum = 3
 Enter an integer
 4
 sum = 7
 Enter an integer
 4
 sum = 11
 Enter an integer
 -3
 sum = 8
 */
import java.util.*;
public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count, addition = 0;
        System.out.println("Enter the count for loop");
        count = sc.nextInt();
        while(count!=0){
            System.out.println("Enter the number: ");
            number = sc.nextInt();
            addition +=  number;
            System.out.println("Sum = "+addition);
            count--;
        }
    }
}
