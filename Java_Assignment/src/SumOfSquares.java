/**
 * Created by ravi on 1/11/18.
 */

/**
 * Exercise 3:
 create another program same as exercise 1 for sum of square of first n numbers
 Note: do two ways 1^2+2^2+3^2+4^2....n or n(n+1)(2n+1)/6
 */
import java.util.*;
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, addition=0;
        System.out.println("Enter the number");
        num = sc.nextInt();
        for(int i=1; i<=num; i++){
            addition += (i*i);
        }
        System.out.println("Result of sum of squares of first n numbers is: "+addition);
    }
}
