package L11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jai");

        //gets an element from the list
        String s = list.get(1);
        System.out.println("element is: "+s);

        //Iterates through the list
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
