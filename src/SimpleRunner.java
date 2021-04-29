public class SimpleRunner {
    public static void main(String[] args) {
        Simple simple= new VerifiedSimple(3,6);
        simple.add();
        Simple simple1= new VerifiedSimple(0,8);
        simple1.add();
        Simple simple2= new Simple(0,7);
        simple2.add();
        Simple simple3= new Simple(0,0);
        simple3.mul();
        Simple simple4= new VerifiedSimple(0,0);
        simple4.mul();
    }
}
