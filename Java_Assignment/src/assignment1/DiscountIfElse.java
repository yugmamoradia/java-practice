package assignment1; /**
 * Created by ravi on 1/11/18.
 */

/**
 * Program 3:
 Write a program which calculate the Discount(5%) price for a collection of items, where the discount applies to purchases
 of total over $10.00.
 cost details:
 50 cents per a cookie
 30 cents per a cake
 Note: take no.of cookies and no.of cakes from user and find 5% discount
 Hit: use if statement and multiplication operation
 */
import java.util.*;
public class DiscountIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double discountPrice, totalPrice;
        int cookieCount, cakeCount;

        System.out.println("Enter number of cookies and number of cakes");
        cookieCount = sc.nextInt();
        cakeCount = sc.nextInt();

        totalPrice = (cookieCount * 0.50) + (cakeCount * 0.30);
        if(totalPrice > 10.0){
            discountPrice = Math.floor((totalPrice * 0.05));
            System.out.println("Total Price is: "+totalPrice+". Discount price is: "+discountPrice);
        }
        else{
            System.out.println("No Discount since amount below $10.0. Total price is: "+totalPrice);
        }

    }
}
