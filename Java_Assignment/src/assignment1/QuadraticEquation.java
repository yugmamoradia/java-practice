package assignment1;

/**
 * Find result for the following quadratic equation
 a quadratic equation is 3*X^2 - 8*X + 4
 give different values to X and run the program and display the result
 Input: integer value for x
 Output: result after substituting the x value.
 e.g:
 input: 1
 output: -1
 explanation: 3*1*1 - 8*1 + 4 = -1
 */

import java.util.*;
public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, result;

        System.out.println("Enter the value of 'X' for following equation: 3*X^2 - 8*X + 4");
        x = sc.nextInt();

        result = 3*x^2 - 8*x + 4;
        System.out.println("The result is: "+result);
    }

}
