package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 10.	Define an arraylist of states of USA and print them. Use Hashset, Treeset and notice the difference
 */

public class ArrayListHashTree {
    public static void main(String[] args) {
        String[] states = {"California", "Texas", "Washington","Oregon", "Nevada", "Kansas", "Florida"};
        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<states.length;i++){
            al.add(states[i]);
        }
        System.out.println(al);

        HashSet<String> hs = new HashSet<>();
        for(int i=0; i<states.length;i++){
            hs.add(states[i]);
        }
        System.out.println(hs);

        TreeSet<String> ts = new TreeSet<>();
        for(int i=0; i<states.length;i++){
            ts.add(states[i]);
        }
        System.out.println(ts);

    }
}
