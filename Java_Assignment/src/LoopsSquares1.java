/**
 * Created by ravi on 1/11/18.
 */

/**
 * Exercise 1:
 create a loop to display first 10 numbers with their square values
 output e.g:
 1 1
 2 4
 3 9
 4 16
 5 25
 6 36
 7 49
 8 64
 9 81
 10 100
 */
import java.util.*;
public class LoopsSquares1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=10; i++){
            System.out.println(i+" "+(i*i));
        }
    }
}
