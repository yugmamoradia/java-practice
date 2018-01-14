package assignment1;

/**
 * Your university asked you to develop a java application to calculate the average of the student's performance.
 Create 6 int variables sub1,sub2,...sub6. give some values to subjects and find the total marks and average of the student
 */
import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3, sub4, sub5, sub6, total;
        float average;

        for(int i = 0; i<3; i++) {
            System.out.println("Enter the marks of "+(i+1)+ "student for 6 subjects");
            sub1 = sc.nextInt();
            sub2 = sc.nextInt();
            sub3 = sc.nextInt();
            sub4 = sc.nextInt();
            sub5 = sc.nextInt();
            sub6 = sc.nextInt();

            total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
            average = (total / 6);

            System.out.println("Total is: " + total + " and average is:" + average);
        }
    }

}
