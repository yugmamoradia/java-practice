/**
 * Created by ravi on 1/11/18.
 */

/**
 * Exercise 6:
 create a write a program to display factorial of a number
 Hint : read a number(n) and use this formula for factorial 1*2*3*....n
 */
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, result=1;
        System.out.println("Enter number");
        num = sc.nextInt();

        if(num==0 || num==1){
            System.out.println("Factorial is 1");
        }
        else{
            for(int i=1; i<=num; i++){
                result *= i;
            }
            System.out.println("Factorial is: "+result);
        }
    }


}
