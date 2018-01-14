package assignment2;

/**
 * 5.Generate following:
 •	Generate 1000 numbers
 •	Generate multiple of 5 and less than 1000
 •	Generate odd numbers up to 1000
 */
public class GenerateNumbers {
    public static void main(String[] args) {
        int num;
        for(int i=1; i<=1000; i++){
            System.out.println(i);
        }

        for(int i=1; i<=1000; i++){
            int result = i*5;
            if(result<1000) {
                System.out.println(result);
            }
        }

        for(int i=1; i<1000; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }

    }
}
