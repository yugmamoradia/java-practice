package assignment2;

/**
 * 9.	Define a String buffer and append all alphabets and display the final string.
 *      And, do the same exercise using StringBuffer.
 */
import java.lang.*;
public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer stringBuffer =  new java.lang.StringBuffer("Sample characters input , Output string: ");
        char[] str = {'a', 'b', 'c', 'd', 'e', 'f'};
        stringBuffer.append(str);
        System.out.println(stringBuffer);
    }
}
