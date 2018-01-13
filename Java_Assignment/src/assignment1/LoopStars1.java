package assignment1; /**
 * Created by ravi on 1/11/18.
 */

/**
 * Exercise 4:
 use loops take number lines and display starts
 display the output like
 *******
 ******
 *****
 ****
 ***
 **
 *

 */
import java.util.*;
public class LoopStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        for(int i=0; i<num; i++){
            for(int j=num; j>i; j--){
                System.out.print("*");
            }
            System.out.println();   // Because we need to print a new line only once the inner loop is done printing
        }
    }
}
