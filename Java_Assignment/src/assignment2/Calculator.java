package assignment2;

/**
 * 3.	Write a class BasicCalulator.java to provide basic mathematical operation like additional, subtractions,
 * multiplications, and division for two numbers. Write a client to use above class and call its operations.
 */
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double  num1, num2, result, divResult;
        int option;
        System.out.println("Select one option for following option: 1.Addition 2.Subtraction 3.Multiplication 4.Division ");
        option = sc.nextInt();
        System.out.println("Enter the two numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        switch(option){
            case 1:
                result = num1 +num2;
                System.out.println("Addition is: "+result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction is: "+result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication is: "+result);
                break;
            case 4:
                divResult = num1 / num2;
                System.out.println("Division is: "+divResult);
                break;
            default:
                System.out.println("incorrect input");

        }
    }
}
