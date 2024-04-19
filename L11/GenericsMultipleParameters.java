package L11;
class Test2<T, P>{
    T obj1;
    P obj2;
    public Test2(T obj1, P obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class GenericsMultipleParameters {
    public static void main(String[] args) {
        Test2<String, Integer> obj = new Test2<String, Integer>("MTL", 15);
        obj.print();
    }
}
