public class AbstractDemo {
    public static void main(String[] args) {
        B2 b2= new B2();
        b2.callme();
        b2.callmetoo();
        System.out.println();
        //Actual object is still B2
        A2 a2= new B2();
        a2.callme();
        a2.callmetoo();
    }
}
