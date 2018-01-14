package assignment2;

/**
 * 4.	Write a java program with following methods:
 •	public Boolean IsInteger(String str)
 •	public Boolean IsOddNumber(String str)
 •	public Boolean IsEvenNumber(String str)
 •	public Boolean IsPrimeNumber(String str)
 */
public class Methods {
    public static void main(String[] args) {

        String number = "37";
        isInteger(number);
        isOddNumber(number);
        isEvenNumber(number);
        isPrimeNumber(number);
    }

    public static boolean isInteger(String input) {
        boolean isAnInteger = false;
        try{
            int num = Integer.parseInt(input);
            isAnInteger = true;
            System.out.println(num+ " is an integer");
        }
        catch(NumberFormatException ex){
            System.out.println("Number is not an integer");
        }
        return isAnInteger;
    }

    public static boolean isOddNumber(String input) {
        boolean isOddNumber = false;
        int num = Integer.parseInt(input);
            if(num%2 == 1){
                isOddNumber = true;
                System.out.println(num+" is an Odd number");
            }
            else{
                System.out.println(num+" is not an odd number");
            }
        return isOddNumber;
    }

    public static boolean isEvenNumber(String input){
        boolean isEvenNumber = false;
        int num = Integer.parseInt(input);
        if(num%2 == 0){
            isEvenNumber = true;
            System.out.println(num+" is an Even Number");
        }
            else{
            System.out.println(num+" is not an even number");
        }
        return isEvenNumber;
    }

    public static boolean isPrimeNumber(String input){
        boolean isPrimeNumber = false;
        int num = Integer.parseInt(input);
        if(num%2==0 || num%3==0 || num%5==0){
            System.out.println(num+" is not a prime number");
        }
        else{
            isPrimeNumber = true;
            System.out.println(num+" is a prime number");
        }
        return isPrimeNumber;
    }




}


