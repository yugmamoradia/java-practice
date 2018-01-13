package assignment1; /**
 * Created by yugma on 1/11/18.
 */

/**
 * Find roots for the following quadratic equation.
 The quadratic equation is a*X^2 - b*X + c
 give different values to a,b and c. Find roots by using formula. (-b +/- sqrt(b^2 - 4*a*c) / 4* a*c)
 If roots are imaginary then display no roots.
 */
import java.util.*;

import static java.lang.Math.sqrt;

public class RootsQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double root0,root1, root2, partialResult;


        System.out.println("Enter the values for a,b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Given quadratic equation: "+a+"x^2 + "+b+"x + "+c);

        partialResult = (b*b) - (4 * a * c);

        if(partialResult>0) {
            root1 = (-b + Math.sqrt(partialResult)) / (2 * a);
            root2 = (-b - Math.sqrt(partialResult)) / (2 * a);

            System.out.println(root1);
            System.out.println(root2);
        }
        else if(partialResult==0){
            root0 = (-b + Math.sqrt(partialResult)) / (2 * a);
            System.out.println("Both roots are equal");
            System.out.println(root0);
        }
        else{
            System.out.println("Roots are imaginary");
        }

    }
}
