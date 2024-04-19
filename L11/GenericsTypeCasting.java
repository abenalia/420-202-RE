package L11;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypeCasting {
    public static void main(String[] args) {
        List typecasetedList = new ArrayList();
        typecasetedList.add("hello");
        String a = (String)typecasetedList.get(0); //typecasting

        //After Generics, we don't need to typecast the object

        List<String> list = new ArrayList<String>();
        list.add("hello");
        String b = list.get(0); //typecasting
    }
}
