package assignment2;

/**
 * 6.	Define an array with 10 integers and print all the elements with its index number.
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int count = arr.length;
        for(int i=0;i<count;i++){
            System.out.println("Index "+i+" has element "+arr[i]);
        }

    }
}
