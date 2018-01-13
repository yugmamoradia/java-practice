package assignment1; /**
 * Created by ravi on 1/11/18.
 */

/**Create a payroll program for the part-time employee.
display no of hours he/she worked, pay rate value and pay rate per month.
Input: no of hours he/she worked and pay rate value per hour
output: display both input values and salary of the person per month
Hint: create 3 double variables hoursWorked, pay rate and use multiplication operation
 */
import java.util.*;
public class Payroll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hoursWorked, payRate, payPerMonth;
        System.out.println("Enter the hours worked and pay rate value");
        hoursWorked = scanner.nextDouble();
        payRate = scanner.nextDouble();

        payPerMonth = ((hoursWorked * payRate) * 30);

        System.out.println("Hours worked are: "+hoursWorked+". Pay rate is: "+payRate+". The salary per month is: "+payPerMonth);


    }

}
