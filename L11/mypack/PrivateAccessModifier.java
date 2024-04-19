// Role of Private Access Modifier
// Two classes A and PrivateAccessModifier. A class contains private data member and
// private method. We are accessing these private members from outside the class
package L11.mypack;

class A {
    private int data = 40;
    private void msg(){
        System.out.println("Hello");
    }
}

public class PrivateAccessModifier {
    public static void main(String[] args) {
        A obj = new A();
        //System.out.println(obj.data); //Compile Time Error
        //obj.msg(); //Compile Time Error
    }
}
