package assignment1;

/**
 * Exercise 2:
 create same problem as exercise 1 for double values
 Continued from while loop (Addition of integer).
 */

import java.util.*;
public class WhileLoopDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number, addition = 0;
        int count;
        System.out.println("Enter the count for loop");
        count = sc.nextInt();
        while(count!=0){
            System.out.println("Enter the number: ");
            number = sc.nextDouble();
            addition +=  number;
            System.out.println("Sum = "+addition);
            count--;
        }
    }
}
