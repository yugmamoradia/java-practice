package assignment1;

/**
 * Exercise 2:
 read two values a,b and repeat a loop from a to b and display value and their square values.
 output e.g:
 enter a and b value
 3
 5

 3 9
 4 16
 5 25
 */

import java.util.*;
public class LoopsInputSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the start number and end number");
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i=a; i<=b; i++){
            System.out.println(i+" "+(i*i));
        }
    }


}
