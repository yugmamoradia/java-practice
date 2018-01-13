package assignment1; /**
 * Created by ravi on 1/11/18.
 */

/**Program 1:
 * Write a program which calculate the Discount(5%) price for an Item.
 Note: take the item price from user and find 5% discount
 Hint: Use Scanner class and nextDouble() method

 Program 2:
 Write a program which calculate the Discount(5%) price for an Item, where the discount applies to purchases over $10.00.
 Note: take the item price from user and find 5% discount
 Hit: use if statement
*/


import java.util.*;
public class IfElse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double itemPrice, discountPrice;
        System.out.println("Enter the item price");
        itemPrice = sc.nextDouble();

        if(itemPrice > 10.0) {
            discountPrice = itemPrice * 0.05;
            System.out.println("Discount price is: "+discountPrice);
        }

        else{
            System.out.println("No discount applied since amount is less than or equal to $10.0");
        }
    }
}
