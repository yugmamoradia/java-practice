package assignment2;

/**
 * 11.	Define a HashMap with state code and state name and print them.
 */
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("CA", "California");
        myMap.put("WA", "Washington");
        myMap.put("TX", "Texas");
        myMap.put("OR", "Oregon");
        myMap.put("NJ", "New Jersey");
        myMap.put("FL", "Florida");

        System.out.println(myMap.keySet());
        for(String key : myMap.keySet()){
            System.out.println("Key: "+key);
            System.out.println("Value: "+ myMap.get(key));
        }

    }
}
