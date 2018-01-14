package assignment2;

/**
 * 8.	Read a contents of text file and count how many times letter “a” is available
 */

import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class TextFileRead{

    public static void main(String[] args)throws IOException {
        FileReader fileReader = new FileReader("/Users/ravi/Documents/Engineering/java-practice/Java_Assignment/src/assignment2/SampleInput.txt");
        int data = fileReader.read();
        int counter = 0;

        while(data!= -1){

            char c = (char) data;

            System.out.println(c);
            if(c == 'a' || c == 'A')
                counter++;
            data = fileReader.read();
        }
        System.out.println("number of A's are: "+counter);

        fileReader.close();
    }

}

