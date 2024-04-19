package L11.mypack;
import L11.pack.ProtectedAccessMethodA;

public class ProtectedAccessMethodB extends ProtectedAccessMethodA{
    public static void main(String[] args) {
        ProtectedAccessMethodA obj = new ProtectedAccessMethodA();
        //obj.msg();
    }
}
