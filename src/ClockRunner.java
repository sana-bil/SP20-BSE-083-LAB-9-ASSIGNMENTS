public class ClockRunner {
    public static void main(String[] args) {
        Clock clock= new Clock(2,4,5);
        clock.display();
        System.out.println("Formatted Time");
        Clock clock1= new ClockChild(23,5,8);
        clock1.display();
        Clock clock2= new ClockChild(8,6,2);
        clock2.display();
    }
}
