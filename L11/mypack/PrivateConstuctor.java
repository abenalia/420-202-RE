// Role of Private Constructor
// You cannot create the instance of that class from outside the class
package L11.mypack;

class B{
    private B(){};
    private void msg(){
        System.out.println("Hello");
    }
}
public class PrivateConstuctor {
    public static void main(String[] args) {
        //B obj = new B(); // Compile Time Error
    }
}
