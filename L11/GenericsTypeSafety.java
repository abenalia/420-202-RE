package L11;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypeSafety {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add("10");

        //With Generics, it is required to specify the type of object we need to store

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        //intList.add("10"); //compile-time error

    }


}
