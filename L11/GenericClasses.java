package L11;
class Test1<T>{
    T obj;
    Test1(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return obj;
    }
}
public class GenericClasses {
    public static void main(String[] args) {
        // Instance of Integer Type
        Test1<Integer> iObj =  new Test1<Integer>(12);
        System.out.println(iObj.getObj());

        // Instance of String Type
        Test1<String> sObj =  new Test1<String>("Hello");
        System.out.println(sObj.getObj());
    }
}
